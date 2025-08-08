import { Component, OnInit } from '@angular/core';
import { Iitem } from '../interfaces';


@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.page.html',
  styleUrls: ['./inicio.page.scss'],
  standalone:false
})
export class InicioPage implements OnInit {
titulo:string="";
lista:Iitem[]=[];
  
constructor() {
 this.titulo="HOME";
this.lista=[
  {
    ruta:"/alerta",
    texto:"Alert",
    icono:"alert-circle-outline"
  },
  {
    ruta:"/accion",
    texto:"Action",
    icono:"magnet-outline"
  }
]

   }

  ngOnInit() {
  }

}
