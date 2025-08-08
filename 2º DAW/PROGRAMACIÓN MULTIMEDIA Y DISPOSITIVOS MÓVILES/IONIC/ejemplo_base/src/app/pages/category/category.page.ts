import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NavController } from '@ionic/angular';
import { ICategoria } from 'src/app/interfaces/ICategoria';
import { CategoriasService } from 'src/app/services/categorias.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.page.html',
  styleUrls: ['./category.page.scss'],
  standalone: false
})
export class CategoryPage implements OnInit {

  categoryId: string | null = '';
  categoria?: ICategoria;

  constructor(
    private route: ActivatedRoute,
    private categoriasService: CategoriasService,
    private navCtrl: NavController
  ) { }

  ngOnInit() {
    this.categoryId = this.route.snapshot.paramMap.get('id'); 
    console.log('Categoria que llega en Category:', this.categoryId);  
    this.categoriasService.getCategorias().subscribe((data : ICategoria[]) => {
      this.categoria = data.find(c => c.categoria == this.categoryId);
      console.log("Obtenido en categorypage: "+this.categoria)
    })
  }
}
