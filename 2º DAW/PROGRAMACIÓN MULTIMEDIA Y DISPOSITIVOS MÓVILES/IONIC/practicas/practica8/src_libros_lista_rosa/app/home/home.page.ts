import { Component, ViewChild} from '@angular/core';
import { Ilibros } from '../interfaz/Ilibros';
import { IonContent } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone:false
})
export class HomePage {
  todos:Ilibros[] = [];
  @ViewChild(IonContent) content: IonContent ={} as IonContent;

  listalibros:Ilibros[]= []
  constructor() {
    this.listalibros=[{
        id:"0",
        titulo: "Cien años de soledad",
        autor: "Gabriel García Márquez",
        imagen: "../../../assets/data/ima1.jpg",
        sinopsis: "Novela que narra la historia de la familia Buendía en el ficticio pueblo de Macondo.",
        genero: "Realismo mágico",
        editorial: "Sudamericana",
        anyopub: "1967",
      },
      {
        id:"1",
        titulo: "1984",
        autor: "George Orwell",
        imagen: "../../../assets/data/ima2.jpg",
        sinopsis: "Distopía que presenta un futuro totalitario donde el Estado controla todos los aspectos de la vida.",
        genero: "Ficción política",
        editorial: "Secker & Warburg",
        anyopub: "1949",
      },
      {
        id:"2",
        titulo: "To Kill a Mockingbird",
        autor: "Harper Lee",
        imagen: "../../../assets/data/ima3.jpg",
        sinopsis: "Novela que aborda temas de injusticia racial y moral en el sur de Estados Unidos durante la Gran Depresión.",
        genero: "Ficción",
        editorial: "J.B. Lippincott & Co.",
        anyopub: "1960",
      },
      {
        id:"3",
        titulo: "Harry Potter and the Philosopher's Stone",
        autor: "J.K. Rowling",
        imagen: "../../../assets/data/ima4.jpg",
        sinopsis: "Primer libro de la serie que sigue las aventuras de un joven mago, Harry Potter, en la escuela de magia Hogwarts.",
        genero: "Fantasía",
        editorial: "Bloomsbury",
        anyopub: "1997",
      },
      {
        id:"4",
        titulo: "The Catcher in the Rye",
        autor: "J.D. Salinger",
        imagen: "../../../assets/data/ima5.jpg",
        sinopsis: "Novela que sigue las experiencias del adolescente Holden Caulfield en Nueva York.",
        genero: "Ficción",
        editorial: "Little, Brown and Company",
        anyopub: "1951",
      },
      {
        id:"5",
        titulo: "The Great Gatsby",
        autor: "F. Scott Fitzgerald",
        imagen: "../../../assets/data/ima6.jpg",
        sinopsis: "La historia se desarrolla en la era del jazz en Nueva York y explora temas de riqueza y decadencia.",
        genero: "Ficción",
        editorial: "Charles Scribner's Sons",
        anyopub: "1925",
      }]

  }
  scrollToTop() {
    this.content.scrollToTop();
  }


  ordenar(respuesta: string){

    if (respuesta == "titulo"){
      this.listalibros = this.listalibros.sort(function(a,b){
      if(a.titulo < b.titulo) {return -1}
      if (a.titulo > b.titulo) {return 1}
      return 0
    })}
    else{
      this.listalibros = this.listalibros.sort(function(a,b){
        if(a.autor < b.autor) {return -1}
        if (a.autor > b.autor) {return 1}
        return 0
      })
    }
    console.log(this.todos )

  }
}
