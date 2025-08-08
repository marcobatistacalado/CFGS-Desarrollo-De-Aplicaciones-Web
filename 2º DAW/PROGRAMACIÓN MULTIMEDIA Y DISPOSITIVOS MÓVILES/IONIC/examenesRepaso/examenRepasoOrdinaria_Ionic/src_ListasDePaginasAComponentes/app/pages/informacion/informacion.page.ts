import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CategoriasService } from '../../services/categorias.service';
import { ICategory, ICategoryRootObject } from '../../interfaces/ICategoria';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-informacion',
  templateUrl: './informacion.page.html',
  styleUrls: ['./informacion.page.scss'],
  standalone: false
})
export class InformacionPage {
  title = "Información";
  categoryId: string | null = '';
  categoria?: ICategory;

  constructor(
    private route: ActivatedRoute,
    private categoriasService: CategoriasService,
    private navCtrl: NavController
  ) { }

  ngOnInit() {
    this.categoryId = this.route.snapshot.paramMap.get('id'); // Obtén el parámetro de la ruta
    console.log('Category ID:', this.categoryId);  // Verifica que recibas el id

    this.categoriasService.getCategorias().subscribe((data: ICategoryRootObject) => {
      this.categoria = data.categories.find(c => c.idCategory == this.categoryId);
    });
  }


  
}
