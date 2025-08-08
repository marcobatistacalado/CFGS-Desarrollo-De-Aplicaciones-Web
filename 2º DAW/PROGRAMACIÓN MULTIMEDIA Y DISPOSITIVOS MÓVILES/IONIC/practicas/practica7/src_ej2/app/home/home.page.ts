import { Component } from '@angular/core';
import { AlertController } from '@ionic/angular'; // Importamos AlertController

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  inputNumber: number | null = null; 
  secretNumber: number = 0; 
  message: string = 'El número es...'; 
  intentos: number = 0; // Contador de intentos
  acertado: boolean = false; // Para controlar la visibilidad del botón

  constructor(private alertController: AlertController) { // Inyectamos AlertController
    this.generarNumeroSecreto(); // Generamos un número aleatorio al iniciar
  }

  checkNumber() {
    if (this.inputNumber === this.secretNumber) {
      this.mostrarAlerta(); // Mostrar el ion-alert al acertar
      this.acertado = true; //cambiar boton
    } else if (this.inputNumber! < this.secretNumber) {
      this.message = 'El número secreto es mayor';
      this.intentos++;
    } else {
      this.message = 'El número secreto es menor';
      this.intentos++;
    }
  }

  async mostrarAlerta() {
    const alert = await this.alertController.create({
      header: '¡Felicidades!',
      subHeader: 'Has acertado el número',
      message: `El número secreto era ${this.secretNumber}.`,
      buttons: ['OK'],
    });

    await alert.present();
  }

  generarNumeroSecreto() {
    this.secretNumber = Math.floor(Math.random() * 10) + 1; // Genera un número entre 1 y 10
  }

  reiniciarJuego() {
    this.inputNumber = null;
    this.message = 'El número es...';
    this.intentos = 0;
    this.acertado = false;
    this.generarNumeroSecreto(); // Genera un nuevo número aleatorio
  }
}
