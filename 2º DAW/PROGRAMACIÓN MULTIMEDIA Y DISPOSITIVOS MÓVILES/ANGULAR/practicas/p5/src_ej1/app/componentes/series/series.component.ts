import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { IAVisual } from '../IAVisual';
import { FilmService } from '../../servicios/film.service';

@Component({
  selector: 'app-series',
  standalone: false,
  templateUrl: './series.component.html',
  styleUrl: './series.component.css'
})
export class SeriesComponent {
   series: IAVisual[] = [];
    
//llamamos al servicio y llamamos al método de obtener las series
 constructor(private data:FilmService){ //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)
  this.data.getSeries().subscribe(
    listaSeries=>{ //funcion lambda: que añade todas las series obtenidas con el subscribe a un array para poder recorrerlo con el Ngfor
      listaSeries.forEach(s=>{this.series.push(s)})
    }
  );
 }
  
}
