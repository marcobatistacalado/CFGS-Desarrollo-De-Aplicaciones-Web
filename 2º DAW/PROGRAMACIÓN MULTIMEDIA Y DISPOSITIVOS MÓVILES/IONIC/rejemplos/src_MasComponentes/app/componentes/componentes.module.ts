import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CabeceraComponent } from './cabecera/cabecera.component';
import { IonicModule } from '@ionic/angular';
import { MenuComponent } from './menu/menu.component';



@NgModule({
  declarations: [CabeceraComponent,MenuComponent],
  imports: [
    CommonModule,IonicModule
  ],
  exports:[CabeceraComponent, MenuComponent]
})
export class ComponentesModule { }
