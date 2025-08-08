import { Component } from '@angular/core';
import { IPost } from '../../interfaces/IPost';
import { DataService } from '../data.service';
import { IMessage } from '../../interfaces/IMessage';

@Component({
  selector: 'app-messagges',
  standalone: false,
  //imports: [],
  templateUrl: './messagges.component.html',
  styleUrl: './messagges.component.css'
})
export class MessaggesComponent {
  messagges: IMessage[] = [];

  constructor(private data:DataService){ //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)
    this.data.getMessagges().subscribe(
      listaMessagges=>{
        listaMessagges.forEach(m=>{this.messagges.push(m)})
      }
    );
   }

}
