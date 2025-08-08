import { Component } from '@angular/core';

@Component({
  selector: 'app-nota',
  standalone: false, //si pertenece a un modulo
  //imports: [],
  templateUrl: './nota.component.html',
  styleUrl: './nota.component.css'
})
export class NotaComponent {
  asignatura = "App móviles";
  nombre = "Pepe Pérez";
  nota = "Aprobado";

}
