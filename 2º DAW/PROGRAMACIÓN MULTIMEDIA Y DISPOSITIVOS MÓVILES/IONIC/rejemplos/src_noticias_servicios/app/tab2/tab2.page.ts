import { Component, OnInit } from '@angular/core';
import { Article } from '../interfaces/INoticias';
import { NoticiasService } from '../services/noticias.service';
import { ActionSheetController } from '@ionic/angular';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  standalone: false,
})
export class Tab2Page implements OnInit{
  categorias: string[] = ['Business', 'Entertainment', 'General', 'Health', 'Science', 'Sports', 'Technology'];
  noticias: Article[] = [];

  constructor(private noticiasService: NoticiasService, public actionSheetController: ActionSheetController) {}

  ngOnInit(){
    this.cargarNoticias(this.categorias[0]);
    //cargar por defecto la primera categria
  }

  noticiasPorCategoria(event: any) {
    const categoriaSeleccionada = event.detail?.value;
    if (!categoriaSeleccionada) return; // Evita errores si el valor es indefinido
  
    this.noticias = []; // Limpiar el array antes de cargar nuevas noticias
    this.cargarNoticias(categoriaSeleccionada);
  }
  

  cargarNoticias(cat:string){
    this.noticiasService.getNoticiasPorCategoria(cat).subscribe(
      respuesta=>{this.noticias.push(...respuesta.articles);}
    )
  }

  async onClick(){
      const actionSheet = await this.actionSheetController.create({
        header: 'Albums',
        buttons: [{
          text: 'Share',
          icon: 'share',
          handler: () => {
            console.log('Share clicked');
          }
        },
        {
          text: 'Favorite',
          icon: 'heart',
          handler: () => {
            console.log('Favorite clicked');
          }
        }, 
        {
          text: 'Cancel',
          icon: 'close',
          role: 'cancel',
          handler: () => {
            console.log('Cancel clicked');
          }
        }]
      });
    
      await actionSheet.present();
    }
  }

