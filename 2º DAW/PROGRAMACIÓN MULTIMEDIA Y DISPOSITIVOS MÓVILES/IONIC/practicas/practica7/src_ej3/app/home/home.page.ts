import { Component } from '@angular/core';
import { ILenguaje } from './ILenguaje';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  arrayLenguajes:ILenguaje[] = [];
  constructor() {
    this.arrayLenguajes = [ 
      { nombre: 'JavaScript', seleccionado: false, descripcion: 'Lenguaje de programación para la web', imagen: 'assets/javascript.png' }, 
      { nombre: 'Python', seleccionado: false, descripcion: 'Lenguaje fácil de aprender y poderoso', imagen: 'assets/python.png' }, 
      { nombre: 'Java', seleccionado: false, descripcion: 'Popular en aplicaciones empresariales y Android', imagen: 'assets/java.png' } 
    ];
    
  }

  //contador!! uso get pq asi accedes al calculo rapido como si  fuese una propiedad, TAMBIEN PODEMOS CREAR UNA PROPIEDAD Y GUARDAR EL VALOR.
  get lenguajesSeleccionados() {
    return this.arrayLenguajes.filter(lenguaje => lenguaje.seleccionado).length;
  }

  //lista de lenguajes seleccionados
  get lenguajesSeleccionadosLista() {
    return this.arrayLenguajes.filter(lenguaje => lenguaje.seleccionado);
  }

}
