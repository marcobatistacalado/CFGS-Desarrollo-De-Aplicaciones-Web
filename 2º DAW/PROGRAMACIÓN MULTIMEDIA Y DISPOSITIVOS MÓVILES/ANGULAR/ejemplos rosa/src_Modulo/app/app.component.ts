import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
//aqui se añaden las rutas por defecto, obligatorio para que sepa donde buscar
/*import { AboutComponent } from './paginas/about/about.component';
import { HomeComponent } from './paginas/home/home.component';
import { ContactComponent } from './paginas/contact/contact.component';*/
import { PaginasModule } from './paginas/paginas.module'; //IMPORTAR MODULO

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, PaginasModule ], //añadir el modulo
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Ejemplo_1';
}
