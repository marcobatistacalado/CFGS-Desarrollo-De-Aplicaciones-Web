import { Component } from '@angular/core';
import { IProducto } from '../../interfaces/producto';
import { ProductoService } from '../../services/producto.service';

@Component({
  selector: 'app-productos',
  standalone: false,
  //imports: [],
  templateUrl: './productos.component.html',
  styleUrl: './productos.component.css'
})
export class ProductosComponent {
  productos: IProducto[] = [];
    
  constructor(private data:ProductoService){
   this.data.getProductos().subscribe(
     listaProductos=>{
      listaProductos.forEach(s=>{this.productos.push(s)})
     }
   );
  }
}
