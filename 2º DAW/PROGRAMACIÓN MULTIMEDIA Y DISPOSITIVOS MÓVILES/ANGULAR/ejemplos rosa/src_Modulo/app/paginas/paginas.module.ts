import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
//los importamos
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';



@NgModule({
  declarations: [AboutComponent, ContactComponent, HomeComponent], //hay que declararlos
  imports: [
    CommonModule
  ],
  exports: [AboutComponent, ContactComponent, HomeComponent] //metemos los componentes
})
export class PaginasModule { }
