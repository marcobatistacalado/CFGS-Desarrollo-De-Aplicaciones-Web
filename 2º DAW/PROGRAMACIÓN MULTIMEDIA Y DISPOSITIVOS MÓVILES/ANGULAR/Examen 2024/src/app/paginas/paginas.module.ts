import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PersonajesComponent } from './personajes/personajes.component';



@NgModule({
  declarations: [PersonajesComponent],
  imports: [
    CommonModule
  ],
  exports: [PersonajesComponent]
})
export class PaginasModule { }


