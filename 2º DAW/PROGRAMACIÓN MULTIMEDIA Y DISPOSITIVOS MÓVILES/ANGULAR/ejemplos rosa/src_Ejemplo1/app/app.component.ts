import { Component, NgModule } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({ //decorador: establece propiedades sobre mi clase
  selector: 'app-root', //esto es lo que tienes que poner en el index si quieres inyectar mi componente.
  standalone: true, //siginifica que es un componente que no vamos a meter dentro de ningún módulo.
  imports: [RouterOutlet, FormsModule], //todos los modulos se importan aquí y arriba del todo.
  //Escribir FormsModule para el binding!!! y ya se escribe arriba el import correspondiente
  templateUrl: './app.component.html', //esto es lo que pinto
  styleUrl: './app.component.css' //esto es lo que decoro
})
export class AppComponent { //esto es la funcionalidad de mi componente
  title = 'Ejemplo_1';

  nombre:string="Rosa";
  edad:number=34;
}
