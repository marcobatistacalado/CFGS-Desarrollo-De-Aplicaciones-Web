import { Component } from '@angular/core';
import { CategoriasService } from '../services/categorias.service';
import { ICategoria } from '../interfaces/ICategoria';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  categorias :ICategoria [] = []
  constructor(private categoriasService: CategoriasService) {
  }

  ngOnInit(){
    this.categoriasService.getCategorias().subscribe((data)=>{
      data.forEach(r => this.categorias.push(r))
      //console.log("Categorias obtenidas en Home: "+this.categorias)
    })
  }

}
