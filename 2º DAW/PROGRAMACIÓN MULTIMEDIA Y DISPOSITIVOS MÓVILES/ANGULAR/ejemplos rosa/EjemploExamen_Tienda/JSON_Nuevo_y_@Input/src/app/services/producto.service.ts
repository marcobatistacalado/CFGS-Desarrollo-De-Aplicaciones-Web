import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IProductoNuevo } from '../interfaces/IProductoNuevo';

import { map } from 'rxjs/operators';
import { IComentario } from '../interfaces/IComentario';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(private http: HttpClient) {}

  // Método que obtiene todo el JSON, incluidos productos y otros datos
  public getTodo(): Observable<IProductoNuevo> {
    return this.http.get<IProductoNuevo>('/data/productosNuevo.json');
  }

  // Método que obtiene solo los comentarios
  public getComentarios(): Observable<IComentario[]> {
    return this.http.get<IComentario[]>('/data/comentarios.json');
  }
}
