import { Component } from '@angular/core';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';

@Component({
  selector: 'app-inicio',
  standalone: false,
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.css',
})
export class InicioComponent {
  todo: IAVisual[] = [];

  constructor(private data: FilmService) { //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)
    this.data.getPeliculas().subscribe((peliculas) => {
      peliculas.forEach((p) => {
        this.todo.push(p);
      });
    });

    this.data.getSeries().subscribe((listaSeries) => {
      listaSeries.forEach((s) => {
        this.todo.push(s);
      });
    });
  }
}
