from django.shortcuts import render
from .forms import FrmUsuario

def home(request):
    if request.method == 'POST':
        form = FrmUsuario(request.POST)
        if form.is_valid():
            name_user = form.cleaned_data['name_user']
            password = form.cleaned_data['password']
            
            
            return render(request, 'perfil/ver_perfil.html', locals())
    else:
        form = FrmUsuario()

    return render(request, 'perfil/home.html', {'form': form})
