import { Component } from '@angular/core';
import { ProductoService } from '../../services/producto.service';
import { IProducto } from '../../interfaces/IProductoNuevo';


@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.css']
})
export class ProductosComponent {
  productos: IProducto[] = [];  // Lista de productos de tipo IProductoNuevo
  
  constructor(private data: ProductoService) {
    this.data.getTodo().subscribe(
      listaProductos => {
        listaProductos.productos.forEach(p=>this.productos.push(p))   // accedes con .productos a la lista de lo que seria el json TODO
      }
    );
  }
}
