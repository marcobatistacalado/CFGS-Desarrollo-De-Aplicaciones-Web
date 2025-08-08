import { Injectable } from '@angular/core';
import {IAVisual} from '../componentes/IAVisual';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

 

  constructor(private http: HttpClient) {}
   
   public getPeliculas(): Observable<IAVisual[]>{
    return this.http.get<IAVisual[]>("/data/peliculas.json");
   }

   public getSeries(): Observable<IAVisual[]>{
    return this.http.get<IAVisual[]>("/data/series.json");
   }

   

}
