import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header.component';
import { FooterComponent } from '../footer/footer.component';
import { IonicModule } from '@ionic/angular';
import { LibrosComponent } from '../libros/libros.component';
import { RouterLink } from '@angular/router';
import { OrdenComponent } from '../orden/orden.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    LibrosComponent,
    OrdenComponent
  ],
  imports: [
    CommonModule,
    IonicModule,
    RouterLink,
    FormsModule
  ],exports:[
    HeaderComponent,
    FooterComponent,
    LibrosComponent,
    OrdenComponent

  ]
})
export class ComponentesModule { }
