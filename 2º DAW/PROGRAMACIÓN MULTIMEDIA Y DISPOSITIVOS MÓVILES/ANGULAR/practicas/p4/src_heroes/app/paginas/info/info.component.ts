import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'; // Importa ActivatedRoute para obtener el parámetro de la URL
import { IHeroe } from '../inicio/IHeroe';

@Component({
  selector: 'app-info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.css']
})
export class InfoComponent implements OnInit {
  lista: IHeroe[] = [];
  heroe: IHeroe | undefined; // Aquí almacenaremos el héroe que se encuentre
  nombreHeroe: string | null = '';

  constructor(private route: ActivatedRoute) {
    this.lista = [
      {
        nombre: 'Superman',
        imagen: 'assets/heroes/superman.jpg',
        edad: 35,
        biografia: 'Superman es el último hijo de Krypton. Criado en la Tierra, se convirtió en el protector de Metrópolis con su fuerza sobrehumana y habilidades de vuelo.',
      },
      {
        nombre: 'Batman',
        imagen: 'assets/heroes/batman.jpg',
        edad: 40,
        biografia: 'Batman es el justiciero de Gotham. Con su intelecto superior y habilidades de combate, protege la ciudad bajo el manto de la noche.',
      },
      {
        nombre: 'Wonder Woman',
        imagen: 'assets/heroes/wonderWoman.jpg',
        edad: 28,
        biografia: 'Wonder Woman es una guerrera amazona y princesa de Themyscira. Con su lazo de la verdad y habilidades de combate, lucha por la justicia y la paz.',
      },
      {
        nombre: 'Flash',
        imagen: 'assets/heroes/flash.jpg',
        edad: 30,
        biografia: 'Flash, también conocido como el hombre más rápido del mundo, usa su velocidad increíble para detener el crimen y proteger Central City.',
      },
      {
        nombre: 'Aquaman',
        imagen: 'assets/heroes/aquaman.jpg',
        edad: 33,
        biografia: 'Aquaman es el rey de Atlantis y protector de los océanos. Con su capacidad para comunicarse con criaturas marinas y su fuerza extraordinaria, defiende el mundo submarino.',
      },
      {
        nombre: 'Spider-Man',
        imagen: 'assets/heroes/spider-man.jpg',
        edad: 25,
        biografia: 'Spider-Man es Peter Parker, un joven que tras ser mordido por una araña radiactiva adquirió habilidades sobrehumanas y lucha contra el crimen en Nueva York.',
      },
      {
        nombre: 'Iron Man',
        imagen: 'assets/heroes/iron-man.jpg',
        edad: 45,
        biografia: 'Iron Man es Tony Stark, un millonario genio y filántropo que utiliza una armadura de alta tecnología para proteger al mundo como superhéroe.',
      },
      {
        nombre: 'Captain America',
        imagen: 'assets/heroes/captain-america.jpg',
        edad: 100,
        biografia: 'Captain America es Steve Rogers, un supersoldado que lucha por la libertad y la justicia desde la Segunda Guerra Mundial.',
      }
    ];
  }

  ngOnInit(): void {
    // Obtiene el nombre del héroe desde la URL y busca al héroe en la lista
    this.nombreHeroe = this.route.snapshot.paramMap.get('nombre');
    //FUNCION LAMBDA
    this.heroe = this.lista.find(h => h.nombre == this.nombreHeroe) || undefined; // Busca directamente el héroe
    
  }
}
