import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InicioComponent } from './inicio/inicio.component';
import { RouterModule } from '@angular/router';
import { PeliculasComponent } from './peliculas/peliculas.component';
import { SeriesComponent } from './series/series.component';
import { ContenidoPeliculaComponent } from './contenido-pelicula/contenido-pelicula.component';
import { ContenidoSerieComponent } from './contenido-serie/contenido-serie.component';



@NgModule({
  declarations: [InicioComponent, PeliculasComponent,SeriesComponent,ContenidoPeliculaComponent,ContenidoSerieComponent],
  imports: [
    CommonModule,RouterModule
  ],
  exports:[InicioComponent,PeliculasComponent,SeriesComponent,ContenidoPeliculaComponent,ContenidoSerieComponent]
})
export class FilmModule { }
