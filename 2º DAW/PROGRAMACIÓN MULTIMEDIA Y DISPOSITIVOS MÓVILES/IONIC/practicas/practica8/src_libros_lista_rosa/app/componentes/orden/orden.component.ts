import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { NavParams } from '@ionic/angular';
import { Ilibros } from 'src/app/interfaz/Ilibros';


@Component({
  selector: 'app-orden',
  templateUrl: './orden.component.html',
  styleUrls: ['./orden.component.scss'],
  standalone:false
})
export class OrdenComponent  implements OnInit {

  @Output () Factor = new EventEmitter();
  ordenador:any

  constructor() {

  }

  ngOnInit() {
  }
  ordenar(){
    this.Factor.emit(this.ordenador);
  }

}
