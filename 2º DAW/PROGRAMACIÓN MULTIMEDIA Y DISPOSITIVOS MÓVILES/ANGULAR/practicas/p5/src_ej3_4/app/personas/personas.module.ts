import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListComponent } from './list/list.component';
import { InputComponent } from './input/input.component';
import { RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms';


@NgModule({
  declarations: [ListComponent, InputComponent],
  imports: [
    CommonModule, RouterModule,  FormsModule
  ],
  exports:[ListComponent, InputComponent]
})
export class PersonasModule { }
