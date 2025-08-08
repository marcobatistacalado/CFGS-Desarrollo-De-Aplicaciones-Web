import { Component, Input, input, OnInit } from '@angular/core';
import { ICategory } from '../../interfaces/ICategoria';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.scss'],
  standalone: false
  
})
export class CategoriasComponent   {
  @Input() categorias :ICategory [] | undefined= []
  constructor(private navCtrl : NavController) { }

  irInfoCategoria(idLlega: string) {
    console.log('Clicked category ID:', idLlega);
    this.navCtrl.navigateForward(['/informacion', idLlega]);  // Correcto, pasa el id como segmento
  }

}
