import { Component } from '@angular/core';
import { NamesService } from '../names.service';

@Component({
  selector: 'app-input',
  standalone: false,
  //imports: [],
  templateUrl: './input.component.html',
  styleUrl: './input.component.css'
})
export class InputComponent {
  nuevoNombre: string = '';

  constructor(private data: NamesService) {}

  addName(): void {
    if (this.nuevoNombre.trim()) {
      this.data.addName(this.nuevoNombre.trim());
      this.nuevoNombre = ''; // Limpia el input tras añadir.
    } else {
      alert('Por favor, introduce un nombre válido.');
    }
  }
}
