import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { TemperaturasService } from '../../services/temperaturas.service';
import { Autonomia, Provincia, RootObject } from '../../interfaces/ITemperatura';

@Component({
  selector: 'app-temperaturas',
  templateUrl: './temperaturas.page.html',
  styleUrls: ['./temperaturas.page.scss'],
  standalone: false
})
export class TemperaturasPage{
  title = 'TEMPERATURAS';
  autonomiaForm = new FormGroup({
    autonomia: new FormControl('', [Validators.required, Validators.minLength(4)]),
  });

  autonomia? : Autonomia;
  provincias: Provincia[] = [];
  nombreAutonomia? : string;

  constructor(private temperaturasService: TemperaturasService) {}

  getProvincias(nombreAutonomia: string) {
    this.autonomia = undefined;
    this.provincias = [];

    this.temperaturasService.getTodo().subscribe((data) => {
      // Buscar la autonomía por nombre ignorando mayúsculas/minúsculas
      const autonomiaEncontrada = data.autonomias.find(
        (a) => a.source.name.toLowerCase() === nombreAutonomia.toLowerCase()
      );

      if (autonomiaEncontrada) {
        this.autonomia = autonomiaEncontrada; // Almacenar solo la encontrada
        this.provincias = autonomiaEncontrada.provincias; // Obtener provincias directamente
      }

      console.log("Autonomía encontrada:", this.autonomia);
      console.log("Provincias:", this.provincias);
    });
  }

  Registrar() {
    if (this.autonomiaForm.valid) {
      this.nombreAutonomia = this.autonomiaForm.controls.autonomia.value?.trim() || ''; // Eliminar espacios innecesarios
      console.log("Registrado: " + this.nombreAutonomia);
      this.getProvincias(this.nombreAutonomia);
    }
  }
}
