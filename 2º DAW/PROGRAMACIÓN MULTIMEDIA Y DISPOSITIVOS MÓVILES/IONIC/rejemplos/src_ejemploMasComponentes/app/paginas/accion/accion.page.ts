import { Component, OnInit } from '@angular/core';
import { ActionSheetController } from '@ionic/angular';

@Component({
  selector: 'app-accion',
  templateUrl: './accion.page.html',
  styleUrls: ['./accion.page.scss'],
  standalone:false
})
export class AccionPage implements OnInit {
titulo:string="";
  constructor(private actionSheetCtrl: ActionSheetController) { 
    this.titulo="ACTION";
  }

  ngOnInit() {
  }

  onClick(){
  this.presentActionSheet();
  }
  

  async presentActionSheet() {
    const actionSheet = await this.actionSheetCtrl.create({
      header: 'Actions',
      buttons: [
        {
          text: 'Delete',
          role: 'destructive',
          data: {
            action: 'delete',
          },
          icon: "trash-outline",
          
        },
        {
          text: 'Share',
          data: {
            action: 'share',
          },
        },
        {
          text: 'Cancel',
          role: 'cancel',
          data: {
            action: 'cancel',
          },
        },
      ],
    });

    await actionSheet.present();
  }
}

