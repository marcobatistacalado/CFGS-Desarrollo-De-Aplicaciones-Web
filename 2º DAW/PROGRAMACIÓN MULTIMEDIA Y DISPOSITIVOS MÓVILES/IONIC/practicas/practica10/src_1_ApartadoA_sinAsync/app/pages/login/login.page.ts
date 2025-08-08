import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { IUsuario } from 'src/app/interfaces/IUsuario';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
  standalone: false
})
export class LoginPage implements OnInit {
  usuarios: IUsuario[] = [];
  usuario = new FormGroup({
    nickname: new FormControl('', [Validators.required, Validators.minLength(4)]),
    password: new FormControl('', [Validators.required, Validators.minLength(4)])
  });
  mensaje = '';

  constructor(private usuarioService: UsuarioService) {}

  ngOnInit(): void {}

  // Método para cargar los usuarios
  cargarUsuarios() {
    this.usuarioService.getUsuarios().subscribe(
      (data: IUsuario[]) => {
        this.usuarios = data; // Guardamos los usuarios en la lista
        console.log(this.usuarios); // Verifica si los usuarios se cargan correctamente
      }
    );
  }

  Login() {
    this.cargarUsuarios();
    
    if (this.usuario.controls.nickname.value !== "admin") {
      this.mensaje = "Credenciales incorrectas";
      return;
    }

    console.log(this.usuario.controls.nickname.value);
    console.log(this.usuario.controls.password.value);

    let usuarioEncontrado = null;
    
    // Ahora, en lugar de hacer solo un console.log, verificamos si las credenciales coinciden
    this.usuarios.forEach((u) => {
      if (
        u.usuario === this.usuario.controls.nickname.value &&
        u.password === this.usuario.controls.password.value
      ) {
        usuarioEncontrado = u; // Encontramos el usuario
      }
    });

    if (usuarioEncontrado) {
      this.mensaje = "Credenciales correctas";
    } else {
      this.mensaje = "Credenciales incorrectas";
    }
  }
}
