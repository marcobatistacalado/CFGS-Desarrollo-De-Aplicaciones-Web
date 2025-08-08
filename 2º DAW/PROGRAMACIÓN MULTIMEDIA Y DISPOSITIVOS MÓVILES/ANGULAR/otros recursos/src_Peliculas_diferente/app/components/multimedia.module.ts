import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PeliculasComponent } from './peliculas/peliculas.component';
import { RouterModule } from '@angular/router';
import { SeriesComponent } from './series/series.component';
import { InicioComponent } from './inicio/inicio.component';
import { SerieDetallesComponent } from './serie-detalles/serie-detalles.component';
import { PeliculaDetallesComponent } from './pelicula-detalles/pelicula-detalles.component';



@NgModule({
  declarations: [PeliculasComponent, SeriesComponent, InicioComponent, SerieDetallesComponent, PeliculaDetallesComponent],
  imports: [
    CommonModule, RouterModule
  ],
  exports: [
    PeliculasComponent, SeriesComponent, InicioComponent, SerieDetallesComponent, PeliculaDetallesComponent
  ]
})
export class MultimediaModule { }
