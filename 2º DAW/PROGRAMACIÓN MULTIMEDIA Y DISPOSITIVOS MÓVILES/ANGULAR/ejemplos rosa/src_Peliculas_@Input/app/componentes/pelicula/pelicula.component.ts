import { Component,Input } from '@angular/core';
import { IAVisual } from '../IAVisual';

@Component({
  selector: 'app-pelicula',
  standalone: false,

  templateUrl: './pelicula.component.html',
  styleUrl: './pelicula.component.css'
})
export class PeliculaComponent {  
@Input() pelicula:IAVisual={
  id: 0,
  titulo: '',
  director: '',
  plataforma: null,
  anio: 0,
  imagen: '',
  sinopsis: '',
  puntuacion: 0,
  temporadas: 0
}
  ;
}
