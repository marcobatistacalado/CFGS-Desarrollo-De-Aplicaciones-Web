import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { HeaderComponent } from './header/header.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { InfoCategoriaComponent } from './info-categoria/info-categoria.component';
import { RecetasComponent } from './recetas/recetas.component';



@NgModule({
  declarations: [HeaderComponent, CategoriasComponent, InfoCategoriaComponent, RecetasComponent],
  imports: [
    CommonModule, IonicModule
  ],
  exports: [HeaderComponent, CategoriasComponent, InfoCategoriaComponent, RecetasComponent]
})
export class ComponentsModule { }
