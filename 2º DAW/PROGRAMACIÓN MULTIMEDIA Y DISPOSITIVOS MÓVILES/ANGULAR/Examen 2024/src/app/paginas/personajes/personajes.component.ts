import { Component } from '@angular/core';
import { CaractersService } from '../caracters.service';
import { IPersonaje } from '../IPersonaje';
import { IRootDetalle } from '../IDetalle';

@Component({
  selector: 'app-personajes',
  standalone: false,
  //imports: [],
  templateUrl: './personajes.component.html',
  styleUrl: './personajes.component.css'
})
export class PersonajesComponent {

  personajes: IPersonaje[] = []; 
  personajeLuke: IPersonaje | undefined;
  
  personajeConcreto: IRootDetalle | undefined;
  detalles: IRootDetalle[] = [];

  
  constructor(private data: CaractersService) {
    //1er  metodo
    this.data.getTodo().subscribe(
      listaPersonajes => {
        listaPersonajes.results.forEach(p=> {
          if (p.uid != "1") {
            this.personajes.push(p);
          }
      });
    }
    );

    //2 metodo
    this.data.getTodo().subscribe(
      listaPersonajes => {
        listaPersonajes.results.forEach(p=> {
          if (p.uid == "1") {
            this.personajeLuke = p; 
          }
      });
    }
    );


    this.data.getDetalles().subscribe(
      listaDetalles => {
        listaDetalles.forEach(d=> {
          this.detalles.push(d)
      });
    }
    );

    
  }

  getPersonajeConcreto(id: String) {
    this.personajeConcreto = this.detalles.find(d => d.result.uid == id);
  }
}
