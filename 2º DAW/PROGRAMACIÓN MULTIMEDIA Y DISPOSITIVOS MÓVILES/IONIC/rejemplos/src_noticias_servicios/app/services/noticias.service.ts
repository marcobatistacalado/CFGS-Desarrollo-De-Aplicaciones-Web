import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { RespuestaToHeadLines } from '../interfaces/INoticias';

@Injectable({
  providedIn: 'root'
})
export class NoticiasService {

  

  constructor(private http: HttpClient) {}

  getTopHeadLines(country: string): Observable<RespuestaToHeadLines> {
    const url = `${environment.baseUrl}?country=${country}&apiKey=${environment.apiKey}`;
    return this.http.get<RespuestaToHeadLines>(url);

    // return this.http.get<RootObject>(`https://newsapi.org/v2/top-headlines?country=${country}&apiKey=e118a14a157a413791ca305c1e4e89c6`);
  }

  getNoticiasPorCategoria(category:string):Observable<RespuestaToHeadLines>{
    const url = `${environment.baseUrl}?category=${category}&apiKey=${environment.apiKey}`;
    return this.http.get<RespuestaToHeadLines>(url);

  }


}
