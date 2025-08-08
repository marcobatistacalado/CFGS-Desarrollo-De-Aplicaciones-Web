import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';

@Component({
  selector: 'app-contenido-serie',
  standalone: false,
  templateUrl: './contenido-serie.component.html',
  styleUrl: './contenido-serie.component.css'
})
export class ContenidoSerieComponent implements OnInit {

  serie: IAVisual | undefined;
  series: IAVisual[] = [];
  
  constructor(private route: ActivatedRoute, private data: FilmService) {} //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)

  ngOnInit(): void {
    // Obtener el ID de la película desde la URL
    const id = this.route.snapshot.paramMap.get('id');
    const numericId = Number(id);

    // Cargar todas las películas al inicializar el componente
    this.data.getSeries().subscribe(listaSeries => {
      this.serie=listaSeries.find(p=>p.id==numericId)
    });
  }
}
