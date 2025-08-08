import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './paginas/inicio/inicio.component';
import { AboutComponent } from './paginas/about/about.component';
import { ContactoComponent } from './paginas/contacto/contacto.component';

const routes: Routes = [
  {
    path:'Inicio',
    component: InicioComponent
  },
  {
    path:'About',
    component: AboutComponent
  },
  {
    path:'Contacto',
    component: ContactoComponent
  },
  {
    path: '**',
    redirectTo: 'Inicio'
  }
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
