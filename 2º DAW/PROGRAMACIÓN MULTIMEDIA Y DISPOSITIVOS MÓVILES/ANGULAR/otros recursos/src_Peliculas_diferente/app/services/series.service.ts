import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ISerie } from '../interfaces/ISerie';

@Injectable({
  providedIn: 'root'
})
export class SeriesService {

    constructor(private http: HttpClient) { }

    public getSeries(): Observable<ISerie[]>{ 
      return this.http.get<ISerie[]>("/data/series.json"); 
    }
}
