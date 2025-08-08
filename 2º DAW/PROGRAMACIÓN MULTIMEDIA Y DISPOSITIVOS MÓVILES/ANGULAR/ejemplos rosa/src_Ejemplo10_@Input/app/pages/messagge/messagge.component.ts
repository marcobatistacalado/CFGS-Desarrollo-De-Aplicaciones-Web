import { Component, Input } from '@angular/core';
import { IMessage } from '../../interfaces/IMessage';

@Component({
  selector: 'app-messagge',
  standalone: false,
  //imports: [],
  templateUrl: './messagge.component.html',
  styleUrl: './messagge.component.css'
})
export class MessaggeComponent {
  /*EL NOMBRE QUE DEBEMOS USAR EN EL HTML DE ESTE COMPONENTE: messagge*/ 
  @Input() messagge:IMessage={
  postId: 0,
  id: 0,
  name: '',
  email: '',
  body: ''
  };
}
