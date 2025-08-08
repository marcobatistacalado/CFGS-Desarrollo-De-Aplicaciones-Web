from django import forms

class AficionesForm(forms.Form):
    nombre = forms.CharField(label='Nombre', max_length=100)
    
    # Campo MultipleChoiceField para aficiones (checkboxes)
    aficiones = forms.MultipleChoiceField(
        label='Elige tus aficiones',
        choices=[
            ('Deportes', 'Deportes'),
            ('Música', 'Música'),
            ('Leer', 'Leer'),
            ('Viajar', 'Viajar'),
            ('Cine', 'Cine'),
        ],
        widget=forms.CheckboxSelectMultiple(),  # Utiliza checkboxes
        required=False,  # No es obligatorio seleccionar ninguna afición
    )
