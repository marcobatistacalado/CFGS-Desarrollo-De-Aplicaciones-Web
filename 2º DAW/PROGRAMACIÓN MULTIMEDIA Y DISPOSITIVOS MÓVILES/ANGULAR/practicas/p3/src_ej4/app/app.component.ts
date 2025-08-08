import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NombresModule } from '../nombres/nombres.module';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NombresModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Ejemplo_1';
}
