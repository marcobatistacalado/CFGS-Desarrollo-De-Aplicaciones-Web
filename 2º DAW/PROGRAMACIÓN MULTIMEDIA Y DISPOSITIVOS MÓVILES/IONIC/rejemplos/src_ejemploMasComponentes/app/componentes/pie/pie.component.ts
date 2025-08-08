import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pie',
  templateUrl: './pie.component.html',
  styleUrls: ['./pie.component.scss'],
  standalone:false
})
export class PieComponent  implements OnInit {
  name:string="";
  constructor() {
    this.name="Rosa Rodríguez";
   }

  ngOnInit() {}

}
