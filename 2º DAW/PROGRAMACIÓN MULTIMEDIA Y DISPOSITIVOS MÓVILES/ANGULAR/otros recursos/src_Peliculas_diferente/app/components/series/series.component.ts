import { Component } from '@angular/core';
import { SeriesService } from '../../services/series.service';
import { ISerie } from '../../interfaces/ISerie';

@Component({
  selector: 'app-series',
  standalone: false,
  //imports: [],
  templateUrl: './series.component.html',
  styleUrl: './series.component.css'
})
export class SeriesComponent {
  series:ISerie[]=[];

  constructor(private data:SeriesService){ 
    this.data.getSeries().subscribe(

      listaPeliculas=>{
        listaPeliculas.forEach(p=>{this.series.push(p)})

      }
    )
  }
}
