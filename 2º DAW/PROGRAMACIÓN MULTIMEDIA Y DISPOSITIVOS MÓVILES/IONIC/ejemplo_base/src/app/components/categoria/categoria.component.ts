import { Component, Input, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { ICategoria } from 'src/app/interfaces/ICategoria';

@Component({
  selector: 'app-categoria',
  templateUrl: './categoria.component.html',
  styleUrls: ['./categoria.component.scss'],
  standalone: false
})
export class CategoriaComponent{

  @Input() categoria?: ICategoria;
  constructor(private navCtrl : NavController) { }

  verImagenes(idLlega: string) {
    this.navCtrl.navigateForward(['/sky', idLlega]); 
  }

  
  
}
