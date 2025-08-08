import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { firstValueFrom } from 'rxjs';
import { IUsuario } from 'src/app/interfaces/IUsuario';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.page.html',
  styleUrls: ['./usuarios.page.scss'],
  standalone: false
})
export class UsuariosPage implements OnInit {
  usuarios: IUsuario[] = [];
  mostrar: boolean = false;
  usuarioSeleccionado?: IUsuario;

  constructor(private navCtrl: NavController, private usuarioService: UsuarioService) { }

  ngOnInit() {
    this.cargarListaUsuarios();
  }

  async cargarListaUsuarios() {
    try {
      // Esperamos a que se carguen los usuarios
      this.usuarios = await firstValueFrom(this.usuarioService.getUsuarios());
      console.log("Usuarios cargados:", this.usuarios);
    } catch (error) {
      console.error("Error al cargar usuarios", error);
    }
  }

  volverAtras() {
    this.navCtrl.back(); // Esto vuelve a la página anterior
  }

  mostrarDetalle(nickname: string) {
    this.usuarioSeleccionado = this.usuarios.find(u => u.usuario === nickname);
    this.mostrar = true; // Siempre muestra la tarjeta al seleccionar un usuario
  }

  cerrarDetalle() {
    this.mostrar = false;
    this.usuarioSeleccionado = undefined;
  }
}
