import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PersonasModule } from './personas/personas.module';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, PersonasModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Ejemplo_1';
}
