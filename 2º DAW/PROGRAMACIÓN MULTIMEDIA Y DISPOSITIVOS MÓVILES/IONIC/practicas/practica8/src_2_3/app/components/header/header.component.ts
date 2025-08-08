import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  standalone: false
})
export class HeaderComponent  implements OnInit {

  headerTitle:string = ''
  constructor() { 
    this.headerTitle = "Libros más vendidos 2025"
  }

  ngOnInit() {}

}
