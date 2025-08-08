import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cabecera',
  templateUrl: './cabecera.component.html',
  styleUrls: ['./cabecera.component.scss'],
  standalone:false
})
export class CabeceraComponent  implements OnInit {
@Input()titulo:string;
  constructor() {
    this.titulo="";
   }

  ngOnInit() {}

}
