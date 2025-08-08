import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICategoria } from '../interfaces/ICategoria';
import { IRootNasa } from '../interfaces/INasa';

@Injectable({
  providedIn: 'root'
})
export class CategoriasService {
  constructor(private http: HttpClient) {}
    
  getCategorias(): Observable<ICategoria[]> {
    return this.http.get<ICategoria[]>('assets/data/categorias.json');
  }

  getNasa(): Observable<IRootNasa> {
    return this.http.get<IRootNasa>('assets/data/nasa.json');
  }
}