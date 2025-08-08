import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './personas/list/list.component';
import { InputComponent } from './personas/input/input.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    { path: '', redirectTo: '/list', pathMatch: 'full' },
    { path: 'list', component: ListComponent },
    { path: 'input', component: InputComponent }
  ];
  
  @NgModule({
      imports: [RouterModule.forRoot(routes)],
      exports: [RouterModule]
    })
  export class AppRoutingModule { }
  