import { RouterModule, Routes } from '@angular/router';
import { MensajesComponent } from './componentes/mensajes/mensajes.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    { path: 'mensajes', component: MensajesComponent },
    { path: '', redirectTo: '/mensajes', pathMatch: 'full' }

  ];

  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule { }