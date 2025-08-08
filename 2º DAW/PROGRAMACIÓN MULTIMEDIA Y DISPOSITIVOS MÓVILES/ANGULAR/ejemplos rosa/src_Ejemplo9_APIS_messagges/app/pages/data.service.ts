import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IPost } from '../interfaces/IPost';
import { IMessage } from '../interfaces/IMessage';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  public getPosts() : Observable<IPost[]>{
    return this.http.get<IPost[]>("https://jsonplaceholder.typicode.com/posts");
  }

  public getMessagges() : Observable<IMessage[]>{
    return this.http.get<IMessage[]>("https://jsonplaceholder.typicode.com/comments");
  }
}
