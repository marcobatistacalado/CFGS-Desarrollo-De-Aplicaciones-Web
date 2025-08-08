import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { IUsuario } from 'src/app/interfaces/IUsuario';  // Asegúrate de que IUsuario esté bien definida

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private http: HttpClient) {}

  // Método para obtener la lista de usuarios desde el archivo JSON
  getUsuarios(): Observable<IUsuario[]> {
    return this.http.get<IUsuario[]>('assets/usuarios.json');
  }

  

}
