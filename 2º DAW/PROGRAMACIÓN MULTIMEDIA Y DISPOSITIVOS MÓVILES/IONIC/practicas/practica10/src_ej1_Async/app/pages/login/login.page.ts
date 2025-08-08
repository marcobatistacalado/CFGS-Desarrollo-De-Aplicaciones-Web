import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NavController } from '@ionic/angular';
import { IUsuario } from 'src/app/interfaces/IUsuario';
import { UsuarioService } from 'src/app/services/usuario.service';
import { firstValueFrom } from 'rxjs';

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

  constructor(private usuarioService: UsuarioService, private navCtrl: NavController) {}

  ngOnInit(): void {}

  async Login() {
    try {
      // Cargar la lista de usuarios
      this.usuarios = await firstValueFrom(this.usuarioService.getUsuarios());
      console.log("Usuarios cargados:", this.usuarios);
      
      // Buscar al usuario en la lista
      let usuarioEncontrado = this.usuarios.find(u =>
        u.usuario === this.usuario.controls.nickname.value &&
        u.password === this.usuario.controls.password.value
      );

      if (usuarioEncontrado) {
        if (usuarioEncontrado.perfil === "administrador") {
          this.mensaje = "Inicio de sesión exitoso.";
          this.irAPaginaUsuarios(); // Redirigir solo si es administrador
        } else {
          this.mensaje = "Acceso denegado. No tienes permisos de administrador.";
        }
      } else {
        this.mensaje = "Credenciales incorrectas.";
      }
    } catch (error) {
      console.error("Error al cargar usuarios", error);
      this.mensaje = "Error al conectar con el servidor.";
    }
  }

  irAPaginaUsuarios() {
    this.navCtrl.navigateForward('/usuarios');
  }
}
