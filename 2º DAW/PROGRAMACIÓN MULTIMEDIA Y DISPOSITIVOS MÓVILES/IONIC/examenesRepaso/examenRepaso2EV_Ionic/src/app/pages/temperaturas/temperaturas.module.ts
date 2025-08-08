import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TemperaturasPageRoutingModule } from './temperaturas-routing.module';

import { TemperaturasPage } from './temperaturas.page';
import { ComponentsModule } from '../../components/components.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TemperaturasPageRoutingModule, 
    ComponentsModule,
    ReactiveFormsModule
  ],
  declarations: [TemperaturasPage]
})
export class TemperaturasPageModule {}
