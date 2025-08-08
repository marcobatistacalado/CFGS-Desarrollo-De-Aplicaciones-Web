import { Component } from '@angular/core';

@Component({
  selector: 'app-body',
  standalone: true,
  imports: [],
  templateUrl: './body.component.html',
  styleUrl: './body.component.css'
})
export class BodyComponent {
  title = 'Angular';
  mensaje = 'Estoy prácticando con ángular para desarrollar aplicaciones en Ionic';
  link = 'Go somewhere';
}
