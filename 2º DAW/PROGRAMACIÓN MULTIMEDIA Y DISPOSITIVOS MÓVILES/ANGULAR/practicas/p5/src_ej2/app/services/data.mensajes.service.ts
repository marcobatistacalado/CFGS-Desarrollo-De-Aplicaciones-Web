import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IMensaje } from '../interfaces/IMensaje';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataMensajesService {

  constructor (private http: HttpClient) { }
  
  public getMensajes() : Observable<IMensaje[]>{
    return this.http.get<IMensaje[]>("/data/mensajes.json");
  }
}
