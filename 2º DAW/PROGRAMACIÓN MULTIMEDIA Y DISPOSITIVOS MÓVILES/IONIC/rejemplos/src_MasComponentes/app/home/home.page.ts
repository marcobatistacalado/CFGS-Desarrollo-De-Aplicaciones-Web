import { Component } from '@angular/core';
interface Iitem{
  texto:string,
  icono:string,
  path:string
}

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone:false
})
export class HomePage {
lista:Iitem[];
  constructor() {
    this.lista=[
      {
        texto:'Grid',
        icono:'grid-outline',
        path:'/grid'
      },
      {
        texto:'Input',
        icono:'text-outline',
        path:'/input'
      },
      {
        texto:'Loading',
        icono:'refresh-circle-outline',
        path:'/loading'
      },
      {
        texto:'Mis Menús',
        icono:'menu-outline',
        path:'/menus'
      },
    ]
  }

}
