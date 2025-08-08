import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NotaComponent } from './nota/nota.component';



@NgModule({
  declarations: [ //declarar los componentes que forman parte del modulo
    NotaComponent
  ],
  imports: [ 
    CommonModule,
  ],
  exports: [NotaComponent] //los componentes que queremos mostrar visibles
})
export class ComponentesModule { }
