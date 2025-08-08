import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NamesService {
  private names: string[] = []; /*['Juan', 'María', 'Pedro', 'Ana', 'Luis']; */
  
  constructor() { }

  addName(n: string): void {
    this.names.push(n);
  }

  getNames(): string[] {
    return this.names;
  }

  clearNames(): void{
    this.names = [];
  }

  deleteName(n:string): string[]{
    this.names = this.names.filter(name => name !== n);
    return this.names;
  }
}
