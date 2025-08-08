import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NavParams } from '@ionic/angular';

@Component({
  selector: 'app-pagina2',
  templateUrl: './pagina2.page.html',
  styleUrls: ['./pagina2.page.scss'],
  providers: [NavParams]
})
export class Pagina2Page implements OnInit {

  constructor(private r: ActivatedRoute ) { }
  pelicula:number;
  ngOnInit() {
    this.pelicula=this.r.snapshot.params.id;
  
  }

}
