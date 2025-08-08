import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { MessaggesComponent } from './messagges/messagges.component';
import { PostsComponent } from './posts/posts.component';
import { AppRoutingModule } from '../app.routes';
import { RouterModule } from '@angular/router';
import { MessaggeComponent } from './messagge/messagge.component';



@NgModule({
  declarations: [AboutComponent, HomeComponent, MessaggesComponent, PostsComponent, MessaggeComponent], /*SOLO HE HECHO DECLARACION DE MESSAGGE; NO LO NECESITO EXPORTAR NO LO VOY A USAR FUERA*/
  imports: [
    CommonModule
  ],
  exports: [AboutComponent, HomeComponent, MessaggesComponent, PostsComponent]
})
export class PagesModule { }
