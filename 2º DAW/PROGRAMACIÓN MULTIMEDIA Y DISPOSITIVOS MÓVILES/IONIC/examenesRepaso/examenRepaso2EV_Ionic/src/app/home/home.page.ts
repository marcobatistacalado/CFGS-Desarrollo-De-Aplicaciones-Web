import { Component } from '@angular/core';
import { TemperaturasService } from '../services/temperaturas.service';
import { Autonomia, RootObject, Source } from '../interfaces/ITemperatura';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  title = 'EXAMEN - FEBRERO';
  sources : Source[] = [];
 
  constructor(private temperaturasService: TemperaturasService, private navCtrl: NavController) {}

  ngOnInit(){
    this.temperaturasService.getTodo().subscribe((data) => {
      data.autonomias.forEach(a=>{this.sources.push(a.source)})
      console.log(this.sources);
  });
   
  }

  mostrarDetalle(name: string) {
    const sourceSeleccionado = this.sources.find(s => s.name === name);
    if(sourceSeleccionado){
      sourceSeleccionado.select = true; 
    }
    
  }
  cerrarDetalle(name: string) {
    const sourceSeleccionado = this.sources.find(s => s.name === name);
    if(sourceSeleccionado){
      sourceSeleccionado.select = false; 
    }
    
  }

  irTemperaturasPage(){
    this.navCtrl.navigateForward("temperaturas");
  }

}