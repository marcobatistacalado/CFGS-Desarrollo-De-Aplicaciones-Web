import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  inputNumber: number | null = null; // Número ingresado por el usuario
  secretNumber: number = 0; // Número secreto generado
  message: string = ''; // Mensaje de resultado

  constructor() {
    this.secretNumber = Math.floor(Math.random() * 10) + 1; // Entre 1 y 10
  }

  checkNumber() {
    if (this.inputNumber === this.secretNumber) {
      this.message = '¡Correcto! Adivinaste el número secreto';
    } else if (this.inputNumber! < this.secretNumber) {
      this.message = 'El número secreto es mayor';
    } else {
      this.message = 'El número secreto es menor';
    }

  }
}
