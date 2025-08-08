from django.shortcuts import render
from .forms import PerfilForm

def home(request):
    if request.method == 'POST':
        form = PerfilForm(request.POST)
        if form.is_valid():
            nombre = form.cleaned_data['nombre']
            apellidos = form.cleaned_data['apellidos']
            email = form.cleaned_data['email']
            edad = form.cleaned_data['edad']
            sexo = form.cleaned_data['sexo']
            temas= form.cleaned_data['temas']
            aficciones = form.cleaned_data['aficciones']
            
            
            return render(request, 'perfil/ver_perfil.html', locals())
    else:
        form = PerfilForm()

    return render(request, 'perfil/home.html', {'form': form})
