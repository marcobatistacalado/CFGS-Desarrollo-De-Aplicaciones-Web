import { Component } from '@angular/core';
import { ISerie } from '../../interfaces/ISerie';
import { ActivatedRoute } from '@angular/router';
import { SeriesService } from '../../services/series.service';

@Component({
  selector: 'app-serie-detalles',
  standalone: false,
  //imports: [],
  templateUrl: './serie-detalles.component.html',
  styleUrl: './serie-detalles.component.css'
})
export class SerieDetallesComponent {
  serie: ISerie | undefined;


  constructor(private route: ActivatedRoute, private data: SeriesService) {} 

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
