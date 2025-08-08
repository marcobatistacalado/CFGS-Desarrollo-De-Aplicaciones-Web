import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-alerta',
  templateUrl: './alerta.page.html',
  styleUrls: ['./alerta.page.scss'],
  standalone:false
})
export class AlertaPage implements OnInit {
titulo:string="";
alertButtons=['OK','CANCEL']
  constructor() { 
    this.titulo="ALERT";
  }

  ngOnInit() {
  }
}
