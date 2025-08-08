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

  
  constructor(private route: ActivatedRoute,private data:FilmService) {}

  ngOnInit(): void {
    let id = this.route.snapshot.paramMap.get('id');
    /*let numericId = id ? Number(id) : null; // Convertir a número, manejar null

    if (numericId !== null && !isNaN(numericId) && numericId > 0 ) {
      this.serie = this.data.getSerie(numericId) ; 
    } else {
      this.serie = undefined; 
    }*/
   let numericId=Number(id);
   this.data.getSeries().subscribe(
    series=>{   this.serie= series.find(s=>s.id==numericId);}
   );
  }
}
