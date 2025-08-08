from django.shortcuts import render, redirect
from productos.models import Producto, Usuario, Categoria
from productos.forms import FrmProducto
from django.db import IntegrityError
# Create your views here.
def Home(request):
    productos = Producto.objects.all()
    return render(request, 'lista_productos.html', {'productos': productos})

def Login(request):
    mensaje = ""

    if request.method == 'POST':
            email = request.POST.get('email', '')
            password = request.POST.get('password', '')
            usuario = buscar_usuario(email)
            if usuario is None:
                mensaje = "Usuario no existe"
                
            elif usuario.password != password:  
                mensaje = "Credenciales incorrectas"
            else:
                
                return redirect('categorias') 

    return render(request, 'login.html', {'mensaje': mensaje})


def buscar_usuario(e):
    try:
        return Usuario.objects.get(email=e)
    except Usuario.DoesNotExist:
        return None
    
def Categorias(request):
    categorias = Categoria.objects.all()
    return render(request, 'lista_categorias.html', {'categorias': categorias})

def VerProductos(request, categoria):
    productos = Producto.objects.filter(categoria=categoria)
    print(productos)
    return render(request, 'lista_productos_categoria.html', {'productos': productos})

def EliminarProducto(request, producto):
    p = Producto.objects.get(idProducto = producto)
    categoria = p.categoria
    p.delete() #borrar
    productos = Producto.objects.filter(categoria=categoria)
    return render(request, 'lista_productos_categoria.html', {'productos': productos})

def EditarProducto(request, producto):
    if request.method == 'GET':
        p = Producto.objects.get(idProducto = producto)
        return render(request, 'editar_producto.html', {'p': p})
    elif request.method == 'POST':
        #editar y devolver vista
        nombre = request.POST.get('nombre', '')
        producto = Producto.objects.get(nombre = nombre) #obtener producto completo
        print(producto.nombre+".----------------------------------------")
        #cambiar precio:
        precio = request.POST.get('precio', '')
        producto.precio = float(precio)
        #guardar
        producto.save()
        
        #volver a productos de esa categoria
        categoria = producto.categoria
        productos = Producto.objects.filter(categoria=categoria)
        return render(request, 'lista_productos_categoria.html', {'productos': productos})

def CrearProducto(request):
    mensaje=""
    if request.method=='POST':
        my_frm=FrmProducto(request.POST)
        if my_frm.is_valid():
            producto=crear_producto(my_frm)
            try:
                producto.save()    
                mensaje='Producto añadido'
            except IntegrityError :  
                mensaje='Producto no añadido'
            return redirect("categorias")
        else:
            mensaje = "No se ha podido gestionar"
    else:
        my_frm=FrmProducto()
    return render(request,'crear_producto.html',{'form':my_frm, 'mensaje':mensaje})

def crear_producto(frm:FrmProducto):
    nombre=frm.cleaned_data['nombre']
    descripcion=frm.cleaned_data['descripcion']
    precio=frm.cleaned_data['precio']
    categoria=frm.cleaned_data['categoria']
    producto=Producto(nombre=nombre,descripcion=descripcion,precio=precio,categoria=categoria)
    return producto

