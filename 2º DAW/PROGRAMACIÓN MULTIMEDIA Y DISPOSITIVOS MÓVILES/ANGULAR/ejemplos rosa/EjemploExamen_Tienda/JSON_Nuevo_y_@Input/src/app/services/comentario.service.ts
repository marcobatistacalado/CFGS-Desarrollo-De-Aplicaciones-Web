import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IComentario } from '../interfaces/IComentario';

@Injectable({
  providedIn: 'root'
})
export class ComentarioService {

  constructor(private http: HttpClient) {}
   
   public getProductos(): Observable<IComentario[]>{
    return this.http.get<IComentario[]>("/data/comentarios.json");
   }
}
