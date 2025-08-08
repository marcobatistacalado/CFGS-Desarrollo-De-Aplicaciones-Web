import { Component } from '@angular/core';
import { IMensaje } from '../../interfaces/IMensaje';
import { DataMensajesService } from '../../services/data.mensajes.service';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-mensajes',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './mensajes.component.html',
  styleUrl: './mensajes.component.css'
})
export class MensajesComponent {
  mensajes : IMensaje[] =  [];
  mensajeSeleccionado: boolean = false;

  constructor(private data:DataMensajesService){ 
    this.data.getMensajes().subscribe(
      listaMensajes=>{
        listaMensajes.forEach(m=>{this.mensajes.push(m)})
      }
    );
  }
  
  verMensaje(): void {
    if (!this.mensajeSeleccionado){
      this.mensajeSeleccionado=true;
    }else{
      this.mensajeSeleccionado=false;
    }
  }

  

}
