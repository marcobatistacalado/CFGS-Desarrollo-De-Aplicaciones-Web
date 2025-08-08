import { Component, Input, input, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { ICategoria } from 'src/app/interfaces/ICategoria';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.scss'],
  standalone: false
})
export class CategoriasComponent{
  @Input() categorias :ICategoria [] | undefined= []

  constructor(private navCtrl : NavController) { }

  irCategory(cat: string) {
    //console.log('Categoria clickada en categoriasComponent:', cat);
    this.navCtrl.navigateForward(['/category', cat]); 
  }

}
