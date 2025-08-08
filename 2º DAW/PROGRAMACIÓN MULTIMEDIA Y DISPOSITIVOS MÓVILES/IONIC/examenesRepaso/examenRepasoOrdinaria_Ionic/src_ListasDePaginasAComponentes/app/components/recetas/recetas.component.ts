import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IMeal } from 'src/app/interfaces/IReceta';
import { RecetasService } from 'src/app/services/recetas.service';

@Component({
  selector: 'app-recetas',
  templateUrl: './recetas.component.html',
  styleUrls: ['./recetas.component.scss'],
  standalone: false
})
export class RecetasComponent  implements OnInit {

  title: string = "Meals";
  strCategory: string | null = '';
  recetas: IMeal[] = [];
  noRecetas: boolean = false;  // Nueva propiedad para controlar si hay o no recetas

  constructor(private route: ActivatedRoute, private recetasService: RecetasService) { }

  ngOnInit() {
    this.strCategory = this.route.snapshot.paramMap.get('id'); // Obtén el parámetro de la ruta
    console.log('Category ID:', this.strCategory);  // Verifica que recibas el id

    this.recetasService.getRecetas().subscribe((data) => {
      this.recetas = data.meals.filter(m => m.strCategory == this.strCategory);
      console.log(this.recetas);  

      // Si no hay recetas, mostramos el mensaje
      this.noRecetas = this.recetas.length === 0;
    });
  }

}
