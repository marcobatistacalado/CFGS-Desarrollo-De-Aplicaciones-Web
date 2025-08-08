import { Routes } from '@angular/router';
import { InicioComponent } from './components/inicio/inicio.component';
import { PeliculasComponent } from './components/peliculas/peliculas.component';
import { SeriesComponent } from './components/series/series.component';
import { PeliculaDetallesComponent } from './components/pelicula-detalles/pelicula-detalles.component';
import { SerieDetallesComponent } from './components/serie-detalles/serie-detalles.component';

export const routes: Routes = [
    {path: 'inicio', component: InicioComponent},
    {path: 'peliculas', component: PeliculasComponent},
    {path: 'series', component: SeriesComponent},
    {path: 'pelicula-detalles/:id', component: PeliculaDetallesComponent},
    {path: 'serie-detalles/:id', component: SerieDetallesComponent},
    { path: '**', redirectTo: 'inicio' }
];
