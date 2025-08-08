import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RootObject, Provincia } from '../interfaces/ITemperatura';

@Injectable({
  providedIn: 'root'
})
export class TemperaturasService {
    constructor(private http: HttpClient) {}
    
    getTodo(): Observable<RootObject> {
      return this.http.get<RootObject>('assets/temperaturas.json');
    }
  }