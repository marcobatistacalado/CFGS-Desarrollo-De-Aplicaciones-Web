import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Routes } from '@angular/router';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
  id:any;
  constructor(private router:ActivatedRoute) { }
    

  ngOnInit(): void {
      this.id=this.router.snapshot.paramMap.get("id");
  }

}
