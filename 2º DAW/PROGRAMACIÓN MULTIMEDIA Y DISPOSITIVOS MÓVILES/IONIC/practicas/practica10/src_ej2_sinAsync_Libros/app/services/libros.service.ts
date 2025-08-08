import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IBook } from '../interfaces/IBook';

@Injectable({
  providedIn: 'root'
})
export class LibrosService {
  constructor(private http: HttpClient) {}

  // Método para obtener la lista de usuarios desde el archivo JSON
  getLibros(): Observable<IBook[]> {
    return this.http.get<IBook[]>('assets/libros.json');
  }
}
