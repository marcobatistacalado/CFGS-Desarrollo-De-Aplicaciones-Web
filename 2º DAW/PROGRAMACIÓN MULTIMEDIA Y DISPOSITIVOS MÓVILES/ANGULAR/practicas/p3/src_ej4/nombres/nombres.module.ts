import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListarNombresComponent } from './listar-nombres/listar-nombres.component';
import { FormsModule } from '@angular/forms' ;


@NgModule({
  declarations: [ListarNombresComponent],
  imports: [
    CommonModule, FormsModule
  ],
  exports:[ListarNombresComponent]
})
export class NombresModule { }
