import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductosComponent } from './productos/productos.component';
import { DetalleProductoComponent } from './detalle-producto/detalle-producto.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [ProductosComponent, DetalleProductoComponent, HomeComponent],
  imports: [
    CommonModule,RouterModule
  ],
  exports: [
    ProductosComponent, DetalleProductoComponent, HomeComponent
  ]
})
export class ShopModule { }
