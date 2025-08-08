import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICategoryRootObject } from '../interfaces/ICategoria';

@Injectable({
  providedIn: 'root'
})
export class CategoriasService {

  constructor(private http: HttpClient) {}
    
    getCategorias(): Observable<ICategoryRootObject> {
      return this.http.get<ICategoryRootObject>('assets/json/categorias.json');
    }
}
