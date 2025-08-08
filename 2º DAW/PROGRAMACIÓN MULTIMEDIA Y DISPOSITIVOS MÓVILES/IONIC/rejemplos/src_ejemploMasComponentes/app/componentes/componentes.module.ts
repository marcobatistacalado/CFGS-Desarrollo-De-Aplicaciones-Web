import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CabeceraComponent } from './cabecera/cabecera.component';
import { PieComponent } from './pie/pie.component';
import { IonicModule } from '@ionic/angular';



@NgModule({
  declarations: [CabeceraComponent,PieComponent],
  imports: [
    CommonModule,IonicModule
  ],
  exports:[CabeceraComponent,PieComponent]
})
export class ComponentesModule { }
