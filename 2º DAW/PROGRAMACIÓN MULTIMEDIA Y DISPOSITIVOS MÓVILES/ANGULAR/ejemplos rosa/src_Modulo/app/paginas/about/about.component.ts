import { Component } from '@angular/core';

@Component({
  selector: 'app-about',
  standalone: false, //esto porque pertenece a un modulo hay que ponerlo false
  //imports: [], //no poner ningun import
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {

}
