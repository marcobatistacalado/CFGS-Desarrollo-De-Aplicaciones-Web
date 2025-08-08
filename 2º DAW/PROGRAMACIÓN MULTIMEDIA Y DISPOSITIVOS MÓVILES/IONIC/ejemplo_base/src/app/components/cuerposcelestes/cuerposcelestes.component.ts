import { Component, Input, OnInit } from '@angular/core';
import { IObjeto } from 'src/app/interfaces/INasa';

@Component({
  selector: 'app-cuerposcelestes',
  templateUrl: './cuerposcelestes.component.html',
  styleUrls: ['./cuerposcelestes.component.scss'],
  standalone: false
})
export class CuerposcelestesComponent  implements OnInit {
  @Input() objetos :  IObjeto[] = []
  constructor() { }

  ngOnInit() {}

}
