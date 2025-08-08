import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InicioComponent } from './inicio/inicio.component';
import { AboutComponent } from './about/about.component';
import { ContactoComponent } from './contacto/contacto.component';



@NgModule({
  declarations: [
    InicioComponent,
    AboutComponent,
    ContactoComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[InicioComponent,AboutComponent,ContactoComponent]
})
export class PaginasModule { }
