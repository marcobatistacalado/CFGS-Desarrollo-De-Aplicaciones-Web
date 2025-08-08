import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accion',
  templateUrl: './accion.page.html',
  styleUrls: ['./accion.page.scss'],
  standalone:false
})
export class AccionPage implements OnInit {
  titulo:string="ACTION";
  constructor() { }

  ngOnInit() {
  }

}
