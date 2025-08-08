import { Component } from '@angular/core';

@Component({
  selector: 'app-asignatura',
  standalone: true,
  imports: [],
  templateUrl: './asignatura.component.html',
  styleUrl: './asignatura.component.css'
})
export class AsignaturaComponent {
  nombre="Desarrollo app híbridas";
  profesor="Rosa Rodríguez";
  curso="DAW2";

}
