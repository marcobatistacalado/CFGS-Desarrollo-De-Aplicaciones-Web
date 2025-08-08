import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: false
})
export class Page1Page implements OnInit {
  headerTitle = 'Página 1';
  footerText = 'Pie de Página 1';
  constructor() { }

  ngOnInit() {
  }

}
