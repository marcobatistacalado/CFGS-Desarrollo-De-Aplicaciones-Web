from django.shortcuts import render
from .forms import AficionesForm

def home(request):
    if request.method == 'POST':
        form = AficionesForm(request.POST)
        if form.is_valid():
            nombre = form.cleaned_data['nombre']
            aficiones = form.cleaned_data['aficiones']
            mensaje = ""
            
            # Generar el mensaje en función de las aficiones seleccionadas
            if len(aficiones) == 0:
                mensaje = f"{nombre}, eres un soso."
            elif len(aficiones) == 1:
                mensaje = f"{nombre}, deberías buscar más aficiones aparte de {aficiones[0]}."
            elif len(aficiones) == 5:
                mensaje = f"{nombre}, creo que tienes demasiadas aficiones."
            else:
                mensaje = f"{nombre}, tus aficiones son:"
            
            return render(request, 'formulario/aficiones.html', {'form': form, 'mensaje': mensaje, 'aficiones': aficiones})
    else:
        form = AficionesForm()

    return render(request, 'formulario/aficiones.html', {'form': form})
