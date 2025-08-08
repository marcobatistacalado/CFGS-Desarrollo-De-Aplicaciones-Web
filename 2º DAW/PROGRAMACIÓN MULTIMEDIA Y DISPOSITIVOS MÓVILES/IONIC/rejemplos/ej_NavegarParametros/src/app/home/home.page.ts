import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { NavController } from '@ionic/angular';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  peliculas: any[] = [ 
    {"titulo": "Encadenados", "director": "Alfred Hitchcock", "id": 1},
    {"titulo": "Casino", "director": "Martin Scorsesse","id":2}
  ]
  constructor(private r: NavController) {
  }
  

  mostrarDetalles(pelicula){
 
    this.r.navigateForward(['/pagina2', pelicula.id]);
  }

}
