from django import forms

class FrmProducto(forms.Form):
    nombre=forms.CharField(max_length=50,widget=forms.TextInput({'class':'form-control','placeholder':"Tu nombre"}))
    descripcion=forms.CharField(max_length=100,widget=forms.TextInput({'class':'form-control','placeholder':"Descripcion"}))
    precio=forms.DecimalField(max_digits=4,decimal_places=2,widget=forms.TextInput({'class':'form-control','placeholder':"Tu precio"}))
    categoria=forms.CharField(max_length=50,widget=forms.TextInput({'class':'form-control','placeholder':"Tu categoria"}))
    