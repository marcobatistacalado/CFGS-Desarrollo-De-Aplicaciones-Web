import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { MenusPageRoutingModule } from './menus-routing.module';

import { MenusPage } from './menus.page';
import { ComponentesModule } from '../componentes/componentes.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    MenusPageRoutingModule,ComponentesModule
  ],
  declarations: [MenusPage]
})
export class MenusPageModule {}
