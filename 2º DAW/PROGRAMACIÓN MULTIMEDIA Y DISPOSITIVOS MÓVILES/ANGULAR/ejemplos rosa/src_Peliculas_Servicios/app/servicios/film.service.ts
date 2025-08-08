import { Injectable } from '@angular/core';
import { IAVisual } from '../componentes/IAVisual';
import { HttpClient } from '@angular/common/http'; //IMPORTARLO
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  private l_multimedia:IAVisual[]=[];

  constructor(private http: HttpClient) {
   
     

  }
    

   //OBSERVABLE ES EL OBJETO QUE TE DEVUELVE CUANDO TENGA TODA LA INFORMACIÓN DESDE EL MODULO HTTPClient.
   public getPeliculas(): Observable<IAVisual[]>{ //LE DECIMOS DE QUE TIPO LO QUEREMOS EN ESTE CASO DE NUESTRA INTERFAZ
    return this.http.get<IAVisual[]>("/data/peliculas.json"); //DESDE DONDE LO QUEREMOS OBTENER: API/JSON
   }

   public getSeries(): Observable<IAVisual[]>{
    return this.http.get<IAVisual[]>("/data/series.json");
   }
  

  

   

}
