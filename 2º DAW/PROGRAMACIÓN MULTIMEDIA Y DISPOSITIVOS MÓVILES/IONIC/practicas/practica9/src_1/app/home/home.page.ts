import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {
  usuario=new FormGroup(
    {
      nombre: new FormControl('',[Validators.required]),
      password: new FormControl('',[Validators.required,Validators.minLength(8), Validators.maxLength(16)]),
      confpassword: new FormControl('',[Validators.required, Validators.minLength(8), Validators.maxLength(16)])
    }
  );

  nombre=new FormControl('');
  password=new FormControl('');
  confpassword=new FormControl('');
  
  constructor(private nav:NavController) { 
  }

  ngOnInit() {
  }

  
  Registrar(){
    if (this.usuario.controls.password.value != this.usuario.controls.confpassword.value){
      console.log("No ha podido ser registrado.")
    }else{
      console.log('Registrado:'+this.usuario.controls.nombre.value);
      console.log(this.usuario.controls.password.value);
      console.log(this.usuario.controls.confpassword.value);
    }
    
    this.nav.navigateBack("/home");
  }

}
