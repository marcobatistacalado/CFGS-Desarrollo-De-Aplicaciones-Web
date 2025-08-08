import { Component, Input, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  standalone: false
})
export class HeaderComponent  implements OnInit {
  @Input() title: string = 'Título por defecto';
  constructor(private navCtrl: NavController) { }

  ngOnInit() {}
  
  volverAtras(){
    this.navCtrl.back();
  }

}
