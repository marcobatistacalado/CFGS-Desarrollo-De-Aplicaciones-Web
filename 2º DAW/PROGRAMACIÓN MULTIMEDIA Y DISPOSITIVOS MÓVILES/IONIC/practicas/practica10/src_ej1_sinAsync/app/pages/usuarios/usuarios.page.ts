import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { IUsuario } from 'src/app/interfaces/IUsuario';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.page.html',
  styleUrls: ['./usuarios.page.scss'],
  standalone: false
})
export class UsuariosPage implements OnInit {
  listaUsuarios : IUsuario[]=[]
  mostrar: boolean = false;
  usuarioSeleccionado?: IUsuario;
  constructor(private navCtrl: NavController, private usuarioService: UsuarioService) { }

  ngOnInit() {
    this.listaUsuarios = this.usuarioService.getUsuarios();
  }

  volverAtras() {
    this.navCtrl.back(); // Esto vuelve a la página anterior
  }

  mostrarDetalle(nickname: string) {
    this.usuarioSeleccionado = this.usuarioService.getUsuarios().find(u => u.usuario === nickname);
    this.mostrar = true; // Siempre muestra la tarjeta al seleccionar un usuario
  }

  cerrarDetalle() {
    this.mostrar = false;
    this.usuarioSeleccionado = undefined;
  }

  irAnadirUsuario(){
    this.navCtrl.navigateForward("add-usuario");
  }


}
