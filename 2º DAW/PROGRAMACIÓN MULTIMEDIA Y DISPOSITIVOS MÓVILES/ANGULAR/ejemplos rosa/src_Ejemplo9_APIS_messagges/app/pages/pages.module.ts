import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { MessaggesComponent } from './messagges/messagges.component';
import { PostsComponent } from './posts/posts.component';
import { AppRoutingModule } from '../app.routes';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [AboutComponent, HomeComponent, MessaggesComponent, PostsComponent],
  imports: [
    CommonModule
  ],
  exports: [AboutComponent, HomeComponent, MessaggesComponent, PostsComponent]
})
export class PagesModule { }
