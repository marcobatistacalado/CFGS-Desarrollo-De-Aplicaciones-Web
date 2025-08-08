import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductosComponent } from './productos/productos.component';
import { DetalleProductoComponent } from './detalle-producto/detalle-producto.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { DetalleComponent } from './detalle/detalle.component';



@NgModule({
  declarations: [ProductosComponent, DetalleProductoComponent, HomeComponent, DetalleComponent],
  imports: [
    CommonModule,RouterModule
  ],
  exports: [
    ProductosComponent, DetalleProductoComponent, HomeComponent, DetalleComponent
  ]
})
export class ShopModule { }
