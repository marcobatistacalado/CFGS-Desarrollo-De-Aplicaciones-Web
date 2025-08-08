import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';

@Component({
  selector: 'app-peliculas',
  standalone: false,
  templateUrl: './peliculas.component.html',
  styleUrl: './peliculas.component.css'
})
export class PeliculasComponent {
   peliculas:IAVisual[]=[];

  constructor(private data:FilmService){ //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)
    this.data.getPeliculas().subscribe(

      listaPeliculas=>{
        listaPeliculas.forEach(p=>{this.peliculas.push(p)})

      }
    );
  }

}



