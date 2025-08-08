import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IMedia } from './IPersonaje';
import { IRootDetalle } from './IDetalle';

@Injectable({
  providedIn: 'root'
})
export class CaractersService {

  constructor(private http: HttpClient) {}

  public getTodo(): Observable<IMedia> {
    return this.http.get<IMedia>('/data/personajes.json');
  }


  public getDetalles(): Observable<IRootDetalle[]> {
    return this.http.get<IRootDetalle[]>('/data/detalles.json');
  }

}
