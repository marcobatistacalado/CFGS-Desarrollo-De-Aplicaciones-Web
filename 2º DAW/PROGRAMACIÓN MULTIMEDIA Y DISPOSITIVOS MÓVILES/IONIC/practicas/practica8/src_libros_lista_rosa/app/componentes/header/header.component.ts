import { Component, Input, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { Ilibros } from 'src/app/interfaz/Ilibros';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  standalone:false
})
export class HeaderComponent  implements OnInit {
  @Input() listalibros:Ilibros[] = []

  constructor(private navCtrl: NavController) { }

  ngOnInit() {

  }

  irAPagina() {
    this.navCtrl.navigateForward(['/buscador']);
  }
}
