import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NavController } from '@ionic/angular';
import { UsuarioService } from 'src/app/services/usuario.service';
import { UsuariosPage } from '../usuarios/usuarios.page';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
  standalone: false
})
export class LoginPage implements OnInit {
  usuario = new FormGroup({
    nickname: new FormControl('', [Validators.required, Validators.minLength(4)]),
    password: new FormControl('', [Validators.required, Validators.minLength(4)])
  });
  mensaje = '';
  constructor(private usuarioService: UsuarioService, private navCtrl: NavController) { }

  ngOnInit() {
  }

  Login(){
    // Buscar al usuario en la lista
    let usuarioEncontrado = this.usuarioService.getUsuarios().find(u =>
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
  }

  irAPaginaUsuarios() {
    this.navCtrl.navigateForward('/usuarios');
  }

  irAñadirUsuario(){
    this.navCtrl.navigateForward('/add-usuario');
  }

}
