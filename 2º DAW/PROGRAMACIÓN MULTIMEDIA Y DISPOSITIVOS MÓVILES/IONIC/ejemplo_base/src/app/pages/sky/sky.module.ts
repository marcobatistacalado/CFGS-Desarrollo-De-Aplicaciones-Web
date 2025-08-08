import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SkyPageRoutingModule } from './sky-routing.module';

import { SkyPage } from './sky.page';
import { ComponentsModule } from 'src/app/components/components.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SkyPageRoutingModule, 
    ComponentsModule
  ],
  declarations: [SkyPage]
})
export class SkyPageModule {}
