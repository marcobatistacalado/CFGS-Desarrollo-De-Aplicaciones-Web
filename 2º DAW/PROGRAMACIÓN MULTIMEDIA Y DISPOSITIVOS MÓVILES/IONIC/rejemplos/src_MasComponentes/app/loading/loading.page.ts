import { Component, OnInit } from '@angular/core';
import { LoadingController, NavController } from '@ionic/angular';

@Component({
  selector: 'app-loading',
  templateUrl: './loading.page.html',
  styleUrls: ['./loading.page.scss'],
  standalone:false
})
export class LoadingPage implements OnInit {
  miloading:HTMLIonLoadingElement={} as HTMLIonLoadingElement;
  constructor(private loadingController: LoadingController,private nav:NavController) { }

  ngOnInit() {
  }

  onClick(){
    //this.presentLoading();
    this.presentLoadingmio();
    setTimeout(
      ()=>{this.miloading.dismiss();this.nav.navigateBack("home")},2000
    );
  }
  async presentLoading() {
    const loading = await this.loadingController.create({
      message: 'Please wait...',
      duration: 2000
    });
    await loading.present();
  }

  async presentLoadingmio(){
    this.miloading = await this.loadingController.create({
      message: '...Cargando',
      
    });
    await this.miloading.present();

  }

}
