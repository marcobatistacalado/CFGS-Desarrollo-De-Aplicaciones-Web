import { Component } from '@angular/core';

@Component({
  selector: 'app-contact',
  standalone: false, //esto porque pertenece a un modulo hay que ponerlo false
  //imports: [], //no poner ningun import
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {

}
