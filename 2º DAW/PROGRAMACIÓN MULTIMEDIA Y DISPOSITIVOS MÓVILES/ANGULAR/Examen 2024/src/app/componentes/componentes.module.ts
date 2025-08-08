import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PieComponent } from './pie/pie.component';
import { CabeceraComponent } from './cabecera/cabecera.component';



@NgModule({
  declarations: [PieComponent, CabeceraComponent],
  imports: [
    CommonModule
  ],
  exports: [
    PieComponent, CabeceraComponent
  ]
})
export class ComponentesModule { }
