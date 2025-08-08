import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LibrosService } from '../../services/libros.service';
import { IBook } from '../../interfaces/IBook';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.page.html',
  styleUrls: ['./book-details.page.scss'],
  standalone: false
})
export class BookDetailsPage implements OnInit {
  books: IBook[] = [];
  book: IBook | undefined;
  
  constructor(private activatedRoute: ActivatedRoute, private librosService: LibrosService) {}

  ngOnInit() {
    const bookId = this.activatedRoute.snapshot.paramMap.get('id');

    this.librosService.getLibros().subscribe((data: IBook[]) => {
      this.books = data; // Guardamos la lista completa o con foreach
      if (bookId !== null) { //podemos hacer que sea un metodo y llamarle una vez la lista este cargada
        this.book = this.books.find((b) => b.id === +bookId); //convetir a string: +
        
      }
    });
  }
}
