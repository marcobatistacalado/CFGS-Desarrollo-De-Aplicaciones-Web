import { Component } from '@angular/core';
import { NavController } from '@ionic/angular';
import { IBook } from '../interfaces/IBook';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  books:IBook[]=[]
  constructor(private navCtrl: NavController){
    this.books = [
      {
        id: 1,
        title: 'Libro 1',
        author: 'Autor 1',
        cover: 'assets/libro1.jpeg',
        synopsis: 'El libro 1 blablabla...',
        genre: 'Ficcion',
        publisher: 'Edebe',
        year: 1999
      },
      {
        id: 2,
        title: 'Libro 2',
        author: 'Autor 2',
        cover: 'assets/libro2.webp',
        synopsis: 'El libro 2 blablabla...',
        genre: 'Romance',
        publisher: 'SM',
        year: 2004
      },
      {
        id: 3,
        title: 'Libro 3',
        author: 'Autor 3',
        cover: 'assets/libro3.webp',
        synopsis: 'El libro 3 blablabla...',
        genre: 'Ciencia Ficción',
        publisher: 'Alianza Editorial',
        year: 2010
      },
      {
        id: 4,
        title: 'Libro 4',
        author: 'Autor 4',
        cover: 'assets/libro4.webp',
        synopsis: 'El libro 4 blablabla...',
        genre: 'Aventura',
        publisher: 'Planeta',
        year: 2015
      },
      {
        id: 5,
        title: 'Libro 5',
        author: 'Autor 5',
        cover: 'assets/libro5.webp',
        synopsis: 'El libro 5 blablabla...',
        genre: 'Misterio',
        publisher: 'Random House',
        year: 2020
      }
    ];
    
  }

  goToBookDetails(bookId: number){
    this.navCtrl.navigateForward('/book-details/'+bookId)
  }

}
