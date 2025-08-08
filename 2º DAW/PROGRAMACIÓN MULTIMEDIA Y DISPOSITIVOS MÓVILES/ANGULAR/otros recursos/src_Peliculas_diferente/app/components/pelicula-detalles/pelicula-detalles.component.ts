import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PeliculasService } from '../../services/peliculas.service';
import { IPelicula } from '../../interfaces/IPelicula';

@Component({
  selector: 'app-pelicula-detalles',
  standalone: false,
  //imports: [],
  templateUrl: './pelicula-detalles.component.html',
  styleUrl: './pelicula-detalles.component.css'
})
export class PeliculaDetallesComponent {

  pelicula: IPelicula | undefined;


  constructor(private route: ActivatedRoute, private data: PeliculasService) {} 

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
