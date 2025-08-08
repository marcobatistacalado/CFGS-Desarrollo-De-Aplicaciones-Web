import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NavController } from '@ionic/angular';
import { ICategoria } from 'src/app/interfaces/ICategoria';
import { IObjeto, IRootNasa } from 'src/app/interfaces/INasa';
import { CategoriasService } from 'src/app/services/categorias.service';

@Component({
  selector: 'app-sky',
  templateUrl: './sky.page.html',
  styleUrls: ['./sky.page.scss'],
  standalone: false
})
export class SkyPage implements OnInit {

  categoryId: string | null = '';
  objetos : IObjeto[] = []

  constructor(
    private route: ActivatedRoute,
    private categoriasService: CategoriasService,
    private navCtrl: NavController
  ) { }

  ngOnInit() {
    this.categoryId = this.route.snapshot.paramMap.get('id'); 
    console.log('Categoria que llega en Sky:', this.categoryId);  
    this.categoriasService.getNasa().subscribe((data : IRootNasa) => {
      data.objects.forEach(o => {
        if (o.categoria == this.categoryId){
          this.objetos.push(o)
        }
      });
        console.log("Objetos obtenidos: "+this.objetos)
      });
  }

}
