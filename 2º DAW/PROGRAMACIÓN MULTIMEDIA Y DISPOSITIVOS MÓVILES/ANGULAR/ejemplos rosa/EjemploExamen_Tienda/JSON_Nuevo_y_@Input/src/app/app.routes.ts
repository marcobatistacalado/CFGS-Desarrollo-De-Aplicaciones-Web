import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { ProductosComponent } from './componentes/productos/productos.component';
import { DetalleProductoComponent } from './componentes/detalle-producto/detalle-producto.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    { path: 'home', component:HomeComponent },
    { path: 'productos', component:ProductosComponent },
    { path: 'detalle-producto/:id', component: DetalleProductoComponent},
    { path: '', redirectTo: '/home', pathMatch: 'full' }

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule { }