import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { PeliculasService } from '../../services/peliculas.service';
import { IPelicula } from '../../interfaces/IPelicula';

@Component({
  selector: 'app-peliculas',
  standalone: false,
  //imports: [],
  templateUrl: './peliculas.component.html',
  styleUrl: './peliculas.component.css'
})
export class PeliculasComponent {

  peliculas:IPelicula[]=[];

  constructor(private data:PeliculasService){ 
    this.data.getPeliculas().subscribe(

      listaPeliculas=>{
        listaPeliculas.forEach(p=>{this.peliculas.push(p)})

      }
    )
  }
}
