import { Component, OnInit } from '@angular/core';
import { MenuController } from '@ionic/angular';

@Component({
  selector: 'app-menus',
  templateUrl: './menus.page.html',
  styleUrls: ['./menus.page.scss'],
  standalone:false,
})
export class MenusPage implements OnInit {

  constructor(private m:MenuController) { }

  ngOnInit() {
  }
verMenu(){
this.m.open("izq");
}
}
