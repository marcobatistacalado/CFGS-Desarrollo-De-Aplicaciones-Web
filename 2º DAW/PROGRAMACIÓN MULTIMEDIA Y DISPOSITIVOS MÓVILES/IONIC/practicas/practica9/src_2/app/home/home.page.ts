import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NavController } from '@ionic/angular';

// Definir la interfaz de Usuario
interface IUsuario {
  nombre: string;
  email: string;
  fechaNacimiento: string;
  telefono: string;
  sexo: string;
}

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  usuarioForm = new FormGroup({
    nombre: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required, Validators.email]),
    fechaNacimiento: new FormControl('', [Validators.required]),
    telefono: new FormControl('', [
      Validators.required,
      Validators.pattern(/^[6]\d{8}$/),
    ]),
    sexo: new FormControl('', [Validators.required]),
  });

  constructor(private nav: NavController) {}

  ngOnInit() {}

  registrar() {
    if (this.usuarioForm.valid) {
      const usuario: IUsuario = this.usuarioForm.value as IUsuario;
      console.log('Usuario Registrado:', usuario);
      alert(`Usuario registrado:\nNombre: ${usuario.nombre}\nEmail: ${usuario.email}\nFecha Nac: ${usuario.fechaNacimiento}\nTeléfono: ${usuario.telefono}\nSexo: ${usuario.sexo}`);
    } else {
      console.log('Formulario no válido');
      alert('Por favor, completa todos los campos correctamente.');
    }
  }
}
