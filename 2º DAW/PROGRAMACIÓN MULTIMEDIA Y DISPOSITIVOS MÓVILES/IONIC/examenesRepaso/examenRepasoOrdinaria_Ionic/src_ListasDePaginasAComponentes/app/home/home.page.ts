import { Component } from '@angular/core';
import { CategoriasService } from '../services/categorias.service';
import { ICategory, ICategoryRootObject } from '../interfaces/ICategoria';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  title : string = "HOME"
  categorias :ICategory [] = []
  constructor(private categoriasService: CategoriasService) {
  }

  ngOnInit(){
    this.categoriasService.getCategorias().subscribe((data)=>{
      data.categories.forEach(r => this.categorias.push(r))
    })
  }

  
  
  

}
