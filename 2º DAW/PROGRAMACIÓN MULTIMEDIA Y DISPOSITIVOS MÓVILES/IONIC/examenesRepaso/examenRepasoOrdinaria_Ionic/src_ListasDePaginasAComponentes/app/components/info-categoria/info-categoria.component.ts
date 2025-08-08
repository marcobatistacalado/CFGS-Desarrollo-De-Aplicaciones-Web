import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NavController } from '@ionic/angular';
import { ICategory, ICategoryRootObject } from 'src/app/interfaces/ICategoria';
import { CategoriasService } from 'src/app/services/categorias.service';

@Component({
  selector: 'app-info-categoria',
  templateUrl: './info-categoria.component.html',
  styleUrls: ['./info-categoria.component.scss'],
  standalone: false
})
export class InfoCategoriaComponent  {
  @Input() categoria?: ICategory;
  constructor(private navCtrl : NavController) { }
  verRecetas(idLlega: string) {
    console.log('Clicked ver recetas category ID:', idLlega);
    this.navCtrl.navigateForward(['/meals', idLlega]);  // Correcto, pasa el id como segmento
  }
  
}
