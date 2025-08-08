import { Component, Input, input } from '@angular/core';
import { IProducto } from '../../interfaces/IProductoNuevo';

@Component({
  selector: 'app-detalle',
  standalone: false,
  //imports: [],
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css'
})
export class DetalleComponent {
  @Input() producto:IProducto={
    id: 0,
    nombre: '',
    categoria: '',
    precio: 0,
    imagen: '',
    descripcion: '',
    puntuacion: 0
  }
}
