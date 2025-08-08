import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: false, //esto porque pertenece a un modulo hay que ponerlo false
  //imports: [], //no poner ningun import
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
