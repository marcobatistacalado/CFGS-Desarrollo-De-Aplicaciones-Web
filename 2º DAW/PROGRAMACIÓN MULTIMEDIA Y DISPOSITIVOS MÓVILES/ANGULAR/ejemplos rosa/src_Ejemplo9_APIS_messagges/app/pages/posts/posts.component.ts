import { Component } from '@angular/core';
import { IPost } from '../../interfaces/IPost';
import { DataService } from '../data.service';

@Component({
  selector: 'app-posts',
  standalone: false,
  //imports: [],
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.css'
})
export class PostsComponent {
  posts: IPost[] = [];

  constructor(private data:DataService){ //inyectar dependencia (no me hace falta hacer new lo hace el sistema: se encarga de hacer el new o ver si ya estaba creada en algun momento)
    this.data.getPosts().subscribe(
      listaPosts=>{
        listaPosts.forEach(m=>{this.posts.push(m)})
      }
    );
   }
}
