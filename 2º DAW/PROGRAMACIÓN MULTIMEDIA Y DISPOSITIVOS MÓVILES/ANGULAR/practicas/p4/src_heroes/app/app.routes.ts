import { Routes } from '@angular/router';
import { InicioComponent } from './paginas/inicio/inicio.component';
import { Component } from '@angular/core';
import { HeroesComponent } from './paginas/heroes/heroes.component';
import { InfoComponent } from './paginas/info/info.component';

export const routes: Routes = [
    {
        path:'',
        component:InicioComponent
    },
    {
        path: 'info/:nombre', 
        component: InfoComponent
    },

    {
        path:'heroes',
        component:HeroesComponent
    },
    {
        path:'**',
        component:InicioComponent
    },
    {
        path:'inicio',
        component:InicioComponent
    }
];
