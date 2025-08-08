import { Component } from '@angular/core';
import { IPersonaje } from '../Ipersonaje';
import { CaractersService } from '../caracters.service';

@Component({
  selector: 'app-personajes',
  standalone: false,
  //imports: [],
  templateUrl: './personajes.component.html',
  styleUrl: './personajes.component.css'
})
export class PersonajesComponent {
  personajes: IPersonaje[] = [];
  personajeRick: IPersonaje[] = [];
  personajeSeleccionado: IPersonaje | undefined;

  constructor(private data: CaractersService) {}

  ngOnInit(): void {

    this.personajes = this.data.getPersonajesSinRick();
    this.personajeRick = this.data.getRick();
  }

  public getSeleccionado(posicion: number): void {
    this.personajeSeleccionado = this.data.getSeleccionado(posicion);
    console.log(this.personajeSeleccionado);
  }
   

}

