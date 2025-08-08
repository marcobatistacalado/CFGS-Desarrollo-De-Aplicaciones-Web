import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { IonicModule } from '@ionic/angular';
import { CategoriaComponent } from './categoria/categoria.component';
import { CuerposcelestesComponent } from './cuerposcelestes/cuerposcelestes.component';



@NgModule({
  declarations: [HeaderComponent, CategoriasComponent, CategoriaComponent, CuerposcelestesComponent],
  imports: [
    CommonModule, IonicModule
  ],
  exports: [HeaderComponent, CategoriasComponent,CategoriaComponent, CuerposcelestesComponent]
  
})
export class ComponentsModule { }
