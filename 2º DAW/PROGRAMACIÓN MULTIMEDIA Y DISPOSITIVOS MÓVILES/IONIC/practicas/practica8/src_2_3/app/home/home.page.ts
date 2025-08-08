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
  books: IBook[] = [];
  filteredBooks: IBook[] = []; // Lista para los libros filtrados
  sortBy: string = 'title'; // Por defecto, ordenar por título
  searchQuery: string = ''; // Valor de la búsqueda (título o autor)

  constructor(private navCtrl: NavController) {
    // Definimos el array de libros
    this.books = [
      {
        id: 1,
        title: 'El Viento de los Olivos',
        author: 'Adriana García',
        cover: 'assets/libro1.jpeg',
        synopsis: 'Un relato fascinante sobre la lucha de un joven por encontrar su lugar en el mundo, en medio de la revolución industrial.',
        genre: 'Ficción histórica',
        publisher: 'Editorial Nova',
        year: 2012
      },
      {
        id: 2,
        title: 'Ecos del Pasado',
        author: 'Carlos Martínez',
        cover: 'assets/libro2.webp',
        synopsis: 'Una novela de misterio donde el protagonista debe desentrañar secretos ocultos en una antigua mansión.',
        genre: 'Misterio',
        publisher: 'Ediciones Lunarias',
        year: 2018
      },
      {
        id: 3,
        title: 'La Puerta Roja',
        author: 'Lucía Pérez',
        cover: 'assets/libro3.webp',
        synopsis: 'Un viaje fantástico a través de una puerta secreta que lleva a un mundo paralelo lleno de magia y aventuras.',
        genre: 'Fantasía',
        publisher: 'Alianza Editorial',
        year: 2015
      },
      {
        id: 4,
        title: 'Cuentos desde el Mar',
        author: 'Javier Rodríguez',
        cover: 'assets/libro4.webp',
        synopsis: 'Colección de relatos cortos sobre personajes que encuentran la redención a través de sus viajes por el mar.',
        genre: 'Narrativa breve',
        publisher: 'Editorial Delfín',
        year: 2020
      },
      {
        id: 5,
        title: 'El Último Refugio',
        author: 'Martín López',
        cover: 'assets/libro5.webp',
        synopsis: 'En un futuro post-apocalíptico, un grupo de sobrevivientes lucha por encontrar un lugar seguro mientras enfrentan peligros inimaginables.',
        genre: 'Ciencia ficción',
        publisher: 'Futurismo Press',
        year: 2023
      }
    ];
    // Inicialmente, los libros filtrados son todos los libros
    this.filteredBooks = [...this.books];
    // Ordenar por defecto
    this.sortBooks();
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
