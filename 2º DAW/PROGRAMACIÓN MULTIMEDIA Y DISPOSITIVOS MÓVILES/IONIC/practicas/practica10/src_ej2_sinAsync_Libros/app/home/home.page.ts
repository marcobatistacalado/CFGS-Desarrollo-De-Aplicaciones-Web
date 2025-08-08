import { Component } from '@angular/core';
import { NavController } from '@ionic/angular';
import { IBook } from '../interfaces/IBook';
import { LibrosService } from '../services/libros.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  books: IBook[] = [];
  filteredBooks: IBook[] = []; // Lista para los libros filtrados
  sortBy: string = 'title'; // Por defecto, ordenar por título
  searchQuery: string = ''; // Valor de la búsqueda (título o autor)

  constructor(private librosService : LibrosService,private navCtrl: NavController) {
    // Definimos el array de libros
    this.librosService.getLibros().subscribe(
    (data: IBook[]) => {
      data.forEach(l => {
        this.books.push(l); //este le guardamos para aluego cuando no se este filtrando por nada cogerlo de aqui
        this.filteredBooks.push(l); //por defecto son las iniciales //el ngfor se encarga de parar esto hasta que lo tengamos
      });

      console.log(this.books); // Verifica si los libros se cargan correctamente
      console.log(this.filteredBooks)
      // Ordenar por defecto después de cargar los libros
      this.sortBooks();
    }
  );
}

  // Método para ordenar los libros según el campo seleccionado
  sortBooks() {
    switch (this.sortBy) {
      case 'title':
        this.books.sort((a, b) => a.title.localeCompare(b.title));
        break;
      case 'author':
        this.books.sort((a, b) => a.author.localeCompare(b.author));
        break;
      case 'genre':
        this.books.sort((a, b) => a.genre.localeCompare(b.genre));
        break;
    }
    this.filterBooks(); // Aplica el filtro después de ordenar
  }

  // Método para cambiar el criterio de ordenación
  changeSort(criteria: string) {
    this.sortBy = criteria;
    this.sortBooks();
  }

  // Método único para filtrar libros por título o autor (dependiendo de la búsqueda)
  filterBooks() {
    const query = this.searchQuery.trim().toLowerCase();
    if (!query) {
      this.filteredBooks = [...this.books]; // Si no hay búsqueda, mostrar todos los libros
    } else {
      // Filtra los libros por título o autor según lo que se esté buscando
      this.filteredBooks = this.books.filter(book =>
        book.title.toLowerCase().includes(query) || book.author.toLowerCase().includes(query)
      );
    }
  }

  // Método para manejar la búsqueda y aplicar el filtro
  onSearchChange() {
    this.filterBooks();
  }

  // Navegar a la página de detalles del libro
  goToBookDetails(bookId: number) {
    this.navCtrl.navigateForward('/book-details/' + bookId);
  }
}
