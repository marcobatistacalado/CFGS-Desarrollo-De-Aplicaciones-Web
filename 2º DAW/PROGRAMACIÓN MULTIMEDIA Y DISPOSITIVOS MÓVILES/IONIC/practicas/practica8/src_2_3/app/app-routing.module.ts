import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'book-details',
    loadChildren: () => import('./pages/book-details/book-details.module').then( m => m.BookDetailsPageModule)
  },
  {
    path: 'book-details/:id', // Ruta para book-details con parámetro id
    loadChildren: () => import('./pages/book-details/book-details.module').then(m => m.BookDetailsPageModule),
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
