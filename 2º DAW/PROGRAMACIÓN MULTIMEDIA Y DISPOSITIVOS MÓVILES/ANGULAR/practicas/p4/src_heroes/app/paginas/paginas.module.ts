import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeroesComponent } from './heroes/heroes.component';
import { InfoComponent } from './info/info.component';
import { InicioComponent } from './inicio/inicio.component';
import { RouterModule } from '@angular/router';
import { MenuComponent } from '../menu/menu.component';



@NgModule({
  declarations: [HeroesComponent, InfoComponent, InicioComponent ],
  imports: [
    CommonModule,RouterModule //RouterModule importarlo para poder usar las rutas
  ],
  exports:[InfoComponent,InicioComponent, HeroesComponent]
})
export class PaginasModule { }
