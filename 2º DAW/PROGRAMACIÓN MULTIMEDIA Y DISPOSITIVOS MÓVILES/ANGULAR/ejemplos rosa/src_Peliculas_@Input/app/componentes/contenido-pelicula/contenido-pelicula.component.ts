import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';


@Component({
  selector: 'app-contenido-pelicula',
  standalone: false,
  templateUrl: './contenido-pelicula.component.html',
  styleUrl: './contenido-pelicula.component.css'
})
export class ContenidoPeliculaComponent implements OnInit {
   pelicula: IAVisual | undefined ;


  constructor(private route: ActivatedRoute,private data:FilmService) {}
  
  ngOnInit(): void {
    let id = this.route.snapshot.paramMap.get('id');
    let numericId =  Number(id) ;
    
    this.data.getPeliculas().subscribe(
      lista_peliculas=>{this.pelicula=lista_peliculas.find(p=>p.id==numericId);   }
    );
  
  }
}
