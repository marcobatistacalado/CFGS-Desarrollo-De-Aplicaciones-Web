import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IUsuario } from '../interfaces/IUsuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  usuarios : IUsuario[]=[]
  constructor(private http: HttpClient) { 
    //Obtener los datos del JSON y meterlos enuna lista que trataremos desde el servicio
      this.http.get<IUsuario[]>('assets/usuarios.json').subscribe(
        listaUsuarios =>{listaUsuarios.forEach(u => {
          this.usuarios.push(u);
        });}
      );
  }

  getUsuarios(): Array<IUsuario> {
    return this.usuarios;
  }

  addUsuario(u : IUsuario): void{
    this.usuarios.push(u);
  }
  
}
