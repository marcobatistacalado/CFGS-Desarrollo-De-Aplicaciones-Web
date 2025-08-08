import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RecetasService } from '../../services/recetas.service';
import { IMeal, IMealsRootObject } from '../../interfaces/IReceta';

@Component({
  selector: 'app-meals',
  templateUrl: './meals.page.html',
  styleUrls: ['./meals.page.scss'],
  standalone: false
})
export class MealsPage {
  title: string = "Meals";
  constructor(){}
}
