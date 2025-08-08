import { Component } from '@angular/core';

@Component({
  selector: 'app-listar-nombres',
  standalone: false,
  //imports: [],
  templateUrl: './listar-nombres.component.html',
  styleUrl: './listar-nombres.component.css'
})
export class ListarNombresComponent {
  nombre: string = '';
  arrayNombres: string[] = [];

  agregarNombre(){
    if (this.nombre.trim()){
      this.arrayNombres.push(this.nombre);
      this.nombre = '';
    }
  }
}
