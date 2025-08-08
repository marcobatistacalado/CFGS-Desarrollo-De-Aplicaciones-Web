import { Component, Input, OnInit, ViewChild } from '@angular/core';
import { Ilibros } from 'src/app/interfaz/Ilibros';

@Component({
  selector: 'app-libros',
  templateUrl: './libros.component.html',
  styleUrls: ['./libros.component.scss'],
  standalone:false
})
export class LibrosComponent  implements OnInit {
  @Input() listalibros:Ilibros[] = []
  constructor() {

  }

  ngOnInit() {}


}
