import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IMealsRootObject } from '../interfaces/IReceta';

@Injectable({
  providedIn: 'root'
})
export class RecetasService {

  constructor(private http: HttpClient) {}
    
  getRecetas(): Observable<IMealsRootObject> {
    return this.http.get<IMealsRootObject>('assets/json/recetas.json');
  }
}
