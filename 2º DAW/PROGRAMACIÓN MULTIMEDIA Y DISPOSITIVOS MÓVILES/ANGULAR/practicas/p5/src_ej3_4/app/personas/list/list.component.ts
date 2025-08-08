import { Component } from '@angular/core';
import { NamesService } from '../names.service';

@Component({
  selector: 'app-list',
  standalone: false,
  //imports: [],
  templateUrl: './list.component.html',
  styleUrl: './list.component.css'
})
export class ListComponent {
  public obtenidos:string[]=[];


  constructor(private data:NamesService){ 
    this.obtenidos = this.data.getNames();
  }

  clearList():void{
    this.obtenidos = []; //borrar mi array
    this.data.clearNames(); //borrar array de servicios
  }

  deleteName(n : string):void{
    this.obtenidos = this.data.deleteName(n);
  }

  

}
