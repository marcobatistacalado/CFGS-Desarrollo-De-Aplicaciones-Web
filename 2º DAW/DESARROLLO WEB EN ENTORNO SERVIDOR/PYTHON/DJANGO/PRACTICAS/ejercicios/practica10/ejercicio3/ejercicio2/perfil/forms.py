from django import forms

class PerfilForm(forms.Form):
    nombre = forms.CharField(label='Nombre', max_length=100)
    apellidos = forms.CharField(label='Apellidos', max_length=100)
    email = forms.EmailField(
        label='Email',
        error_messages={
            'invalid': 'INGRESA UN CORREO VALIDO'
        }                         
    )
    edad = forms.IntegerField(label='Edad')
    
    def clean_edad(self):
        edad = self.cleaned_data['edad']
        if edad <= 16:
            raise forms.ValidationError('La edad debe ser mayor a 16 años.')
        return edad
    
    sexo = forms.ChoiceField(
        label='Sexo',
        choices = [
            ("Masculino", "Masculino"),
            ("Femenino", "Femenino")
        ],
        widget=forms.RadioSelect,
        required=False,
    )
    temas = forms.ChoiceField(
        label='Temas',
        choices = [
            ("Programación", "Programación"),
            ("Arte", "Arte"),
            ("Futbol", "Futbol")
        ],
        widget=forms.Select,
        required=False,
    )
        
    aficciones = forms.MultipleChoiceField(
        label='Elige tus aficiones',
        choices=[
            ('Deportes', 'Deportes'),
            ('Música', 'Música'),
            ('Leer', 'Leer'),
            ('Viajar', 'Viajar'),
            ('Cine', 'Cine'),
        ],
        widget=forms.CheckboxSelectMultiple(),
        required=False,  # No es obligatorio seleccionar ninguna afición
    )
