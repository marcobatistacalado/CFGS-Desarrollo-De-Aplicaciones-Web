import { Component } from '@angular/core';
import { NgFor } from '@angular/common';
import { IPelicula } from './IPelicula';
@Component({
  selector: 'app-peliculas',
  standalone: false,
  //imports:,
  templateUrl: './peliculas.component.html',
  styleUrl: './peliculas.component.css'
})
export class PeliculasComponent {
//titulo director y año 
  lista:IPelicula[]=[];
  constructor(){
    this.lista=[
    {
      titulo:'IT', 
      director:'Tomy Lee', 
      ano: 1990,
      imagen: "assets/carteleras/it.jpeg"
    },
    {
      titulo:'Click', 
      director:'Frank Coraci', 
      ano: 2006,
      imagen: "assets/carteleras/click.jpg"
    },
    {
      titulo:'Crash', 
      director:'Paul Haggis', 
      ano: 2004,
      imagen: "assets/carteleras/crash.jpeg"
    }
  ]
  }
}
