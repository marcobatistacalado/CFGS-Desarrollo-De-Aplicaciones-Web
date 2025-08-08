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
    
 constructor(private data:FilmService){
  this.data.getSeries().subscribe(
    listaSeries=>{
      listaSeries.forEach(s=>{this.series.push(s)})
    }
  );
 }
  
}
