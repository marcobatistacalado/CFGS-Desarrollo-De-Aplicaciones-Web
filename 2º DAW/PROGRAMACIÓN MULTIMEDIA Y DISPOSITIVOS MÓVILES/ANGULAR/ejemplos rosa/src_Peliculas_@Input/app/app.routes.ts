import { RouterModule, Routes } from '@angular/router';
import { PeliculasComponent } from './componentes/peliculas/peliculas.component';
import { NgModule } from '@angular/core';
import { SeriesComponent } from './componentes/series/series.component';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { ContenidoPeliculaComponent } from './componentes/contenido-pelicula/contenido-pelicula.component';
import { ContenidoSerieComponent } from './componentes/contenido-serie/contenido-serie.component';

export const routes: Routes = [
    { path: 'peliculas', component: PeliculasComponent },
    { path: '', redirectTo: '/inicio', pathMatch: 'full' },
    { path: 'series', component: SeriesComponent },
    { path: 'inicio', component: InicioComponent },
    { path: 'contenido-pelicula/:id', component: ContenidoPeliculaComponent },
    { path: 'contenido-serie/:id', component: ContenidoSerieComponent}




  ];

  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule { }