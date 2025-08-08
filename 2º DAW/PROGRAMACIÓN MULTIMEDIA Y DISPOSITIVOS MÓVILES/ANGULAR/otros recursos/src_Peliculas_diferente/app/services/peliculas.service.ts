import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IPelicula } from '../interfaces/IPelicula';

@Injectable({
  providedIn: 'root'
})
export class PeliculasService {

  constructor(private http: HttpClient) { }

  public getPeliculas(): Observable<IPelicula[]>{ 
    return this.http.get<IPelicula[]>("/data/peliculas.json"); 
   }
}
