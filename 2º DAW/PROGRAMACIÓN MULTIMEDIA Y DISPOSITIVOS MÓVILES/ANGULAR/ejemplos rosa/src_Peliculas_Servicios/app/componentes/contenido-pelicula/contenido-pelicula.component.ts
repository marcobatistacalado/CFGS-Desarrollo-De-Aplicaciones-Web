import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';

@Component({
  selector: 'app-contenido-pelicula',
  standalone: false,
  templateUrl: './contenido-pelicula.component.html',
  styleUrls: ['./contenido-pelicula.component.css']
})
export class ContenidoPeliculaComponent implements OnInit {
  pelicula: IAVisual | undefined;


  constructor(private route: ActivatedRoute, private data: FilmService) {} //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)

  ngOnInit(): void {
    // Obtener el ID de la película desde la URL
    const id = this.route.snapshot.paramMap.get('id');
    const numericId = Number(id);

    // Cargar todas las películas al inicializar el componente
    this.data.getPeliculas().subscribe(listaPeliculas => {
      this.pelicula=listaPeliculas.find(p=>p.id==numericId)
    });
  }
}
