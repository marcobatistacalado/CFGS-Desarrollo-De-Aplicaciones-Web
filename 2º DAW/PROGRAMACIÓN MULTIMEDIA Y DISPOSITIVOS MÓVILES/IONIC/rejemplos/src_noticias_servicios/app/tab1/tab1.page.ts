import { Component, OnInit } from '@angular/core';
import { NoticiasService } from '../services/noticias.service';
import { Article } from '../interfaces/INoticias';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  standalone: false,
})
export class Tab1Page implements OnInit{

  lNoticias: Article[]=[]
  constructor(private snoticias:NoticiasService) {
  }

  ngOnInit(): void {
    console.log(this.snoticias.getTopHeadLines)
    this.snoticias.getTopHeadLines("us").subscribe(
      datos=>{datos.articles.forEach(a=>{this.lNoticias.push(a)})}
    )
  }
}
