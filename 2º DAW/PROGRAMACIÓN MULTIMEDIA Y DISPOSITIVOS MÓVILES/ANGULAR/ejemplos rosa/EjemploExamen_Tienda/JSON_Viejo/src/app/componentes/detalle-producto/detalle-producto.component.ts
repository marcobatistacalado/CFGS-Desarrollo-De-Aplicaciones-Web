import { Component } from '@angular/core';
import { IProducto } from '../../interfaces/producto';
import { ActivatedRoute } from '@angular/router';
import { ProductoService } from '../../services/producto.service';
import { IComentario } from '../../interfaces/comentario';

@Component({
  selector: 'app-detalle-producto',
  standalone: false,
  //imports: [],
  templateUrl: './detalle-producto.component.html',
  styleUrl: './detalle-producto.component.css'
})
export class DetalleProductoComponent {
  producto: IProducto | undefined ;
  comentarios: IComentario[] = [];


  constructor(private route: ActivatedRoute,private data:ProductoService) {}
  
  ngOnInit(): void {
    let id = this.route.snapshot.paramMap.get('id');
    let numericId =  Number(id) ;
    this.data.getProductos().subscribe(
      lista_productos=>{this.producto=lista_productos.find(p=>p.id==numericId);   }
    );

    // Obtén los comentarios del producto: FILTER
    this.data.getComentarios().subscribe(
      lista_comentarios=>{this.comentarios=lista_comentarios.filter(p=>p.productoId==numericId);   }
    );
  
  }
}
