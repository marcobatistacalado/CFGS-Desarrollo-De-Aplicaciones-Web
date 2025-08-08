import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MenuComponent } from './menu/menu.component';
import { InicioComponent } from './inicio/inicio.component';
import { PostComponent } from './post/post.component';
import { RouterModule } from '@angular/router';
import { PostsComponent } from './posts/posts.component';



@NgModule({
  declarations: [
    MenuComponent,
    InicioComponent,
    PostComponent,
    PostsComponent
  ],
  imports: [
    CommonModule,RouterModule
  ],
  exports:[
    MenuComponent,InicioComponent,PostComponent,PostsComponent
  ]
})
export class ComponentesModule { }
