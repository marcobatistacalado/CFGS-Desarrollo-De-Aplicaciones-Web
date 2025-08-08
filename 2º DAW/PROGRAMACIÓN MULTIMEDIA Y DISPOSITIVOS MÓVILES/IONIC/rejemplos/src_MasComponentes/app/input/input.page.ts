import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup , Validators} from '@angular/forms';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-input',
  templateUrl: './input.page.html',
  styleUrls: ['./input.page.scss'],
  standalone:false
})
export class InputPage implements OnInit {
  
  usuario=new FormGroup(
    {
      nombre: new FormControl('',[Validators.required,Validators.minLength(8)]),
      email: new FormControl('',[Validators.required,Validators.email])
    }
  );
 
    nombre=new FormControl('');
  
  constructor(private nav:NavController) { 
   
  }

  ngOnInit() {
  }

  
  Registrar(){
    console.log('Registrar'+this.usuario.controls.nombre.value);
    this.nav.navigateBack("/home");
  }
}
