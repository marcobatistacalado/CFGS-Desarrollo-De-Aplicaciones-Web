import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AsignaturaComponent } from './asignatura/asignatura.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,AsignaturaComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Ejemplo_1';
}
