import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IProducto } from '../interfaces/producto';
import { IComentario } from '../interfaces/comentario';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(private http: HttpClient) {}
   
   public getProductos(): Observable<IProducto[]>{
    return this.http.get<IProducto[]>("/data/productos.json");
   }

   public getComentarios(): Observable<IComentario[]>{
    return this.http.get<IComentario[]>("/data/comentarios.json");
   }

}
