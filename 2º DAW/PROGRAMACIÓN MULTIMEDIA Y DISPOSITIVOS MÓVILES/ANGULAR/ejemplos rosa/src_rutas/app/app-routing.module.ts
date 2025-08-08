import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { PostComponent } from './componentes/post/post.component';
import { PostsComponent } from './componentes/posts/posts.component';

const routes: Routes = [
{
  path: 'Inicio',
  component:InicioComponent
},
{
  path:'Post',
  component:PostsComponent
},
{
  path:'Post/:id',
  component:PostComponent
},
{
  path:'**',
  redirectTo: 'Inicio'
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
