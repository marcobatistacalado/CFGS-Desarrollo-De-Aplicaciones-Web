import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PaginasModule } from './paginas/paginas.module';
import { MenuComponent } from './menu/menu.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, PaginasModule,MenuComponent], //router outlet: importarlo para poder inyectar en el html <router-outlet>
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'main';
}
