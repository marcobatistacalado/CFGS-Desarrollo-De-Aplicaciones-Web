import { Component, OnInit } from '@angular/core';
import { IItemMenu } from '../interfaz';
import { InicioComponent } from 'src/app/paginas/inicio/inicio.component';


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  listaMenu:IItemMenu[];
  constructor() {
    this.listaMenu=[
      {
        path:'/Inicio',
        text:'INICIO'
      },
      {
        path:'/Contacto',
        text:'CONTACTO'
      },
      {
        path:'/About',
        text:'ACERCA DE'
      }
    ];
   }

  ngOnInit(): void {
  }

}
