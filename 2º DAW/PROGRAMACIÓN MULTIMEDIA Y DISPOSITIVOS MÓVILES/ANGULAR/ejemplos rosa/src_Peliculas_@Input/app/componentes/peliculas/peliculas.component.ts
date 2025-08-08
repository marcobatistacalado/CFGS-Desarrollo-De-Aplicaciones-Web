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

  constructor(private data:FilmService){
    this.data.getPeliculas().subscribe(

      listaPeliculas=>{
        listaPeliculas.forEach(p=>{this.peliculas.push(p)})

      }
    );
  }

}



