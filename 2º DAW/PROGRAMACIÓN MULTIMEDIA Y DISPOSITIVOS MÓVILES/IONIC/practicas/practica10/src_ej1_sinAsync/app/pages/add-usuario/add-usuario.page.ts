import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UsuariosPage } from '../usuarios/usuarios.page';
import { NavController } from '@ionic/angular';
import { UsuarioService } from 'src/app/services/usuario.service';
import { IUsuario } from 'src/app/interfaces/IUsuario';

@Component({
  selector: 'app-add-usuario',
  templateUrl: './add-usuario.page.html',
  styleUrls: ['./add-usuario.page.scss'],
  standalone: false
})
export class AddUsuarioPage implements OnInit {
  nuevoUsuario?:IUsuario
  usuarioRegister = new FormGroup({
    usuario: new FormControl('', [Validators.required, Validators.minLength(4)]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
    nombre: new FormControl('', [Validators.required, Validators.pattern("^[a-zA-Z ]+$")]), // Solo letras y espacios
    email: new FormControl('', [Validators.required, Validators.email]),
    perfil: new FormControl('', [Validators.required]) // Puede ser 'administrador' o 'usuario'
  });
  constructor(private usuarioService: UsuarioService, private navCtrl: NavController) { }

  ngOnInit() {
  }

  AddUsuario() : void{
    this.nuevoUsuario = {
      usuario: this.usuarioRegister.value.usuario!,
      password: this.usuarioRegister.value.password!,
      nombre: this.usuarioRegister.value.nombre!,
      email: this.usuarioRegister.value.email!,
      perfil: this.usuarioRegister.value.perfil!,
    }

    if (this.nuevoUsuario){
      this.usuarioService.addUsuario(this.nuevoUsuario);
      this.navCtrl.back();
    }
    
  }

}
