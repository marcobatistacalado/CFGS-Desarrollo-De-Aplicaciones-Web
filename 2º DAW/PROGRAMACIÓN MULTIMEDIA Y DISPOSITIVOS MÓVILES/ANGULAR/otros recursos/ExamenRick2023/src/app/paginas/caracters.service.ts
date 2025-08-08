import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPersonaje } from './Ipersonaje';

@Injectable({
  providedIn: 'root'
})
export class CaractersService {
  listaPersonajes: IPersonaje[] = [];
  personajeRick: IPersonaje[] = [];

  constructor(private http: HttpClient) {
    this.http.get<IPersonaje[]>("data/examen2023.json").subscribe(
      (l) => {
        // Procesamos la respuesta
        l.forEach((m) => {
          if (m.id == 1) {
            this.personajeRick.push(m); // Agregar a Rick
          } else {
            this.listaPersonajes.push(m); // Agregar al resto
          }
        });
      },
      (error) => {
        console.error("Error al cargar los datos:", error);
      }
    );
  }

  public getRick(): IPersonaje[] {
    return this.personajeRick;
  }

  public getPersonajesSinRick(): IPersonaje[] {
    return this.listaPersonajes;
  }

  public getSeleccionado(posicion: number): IPersonaje | undefined {
    return this.listaPersonajes.find(m => m.id === posicion); 
  }
}
