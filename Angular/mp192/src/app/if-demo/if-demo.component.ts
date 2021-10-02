import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-if-demo',
  templateUrl: './if-demo.component.html',
  styleUrls: ['./if-demo.component.css']
})
export class IfDemoComponent implements OnInit {

  public product = {
    Name: 'Nike Casuals',
    Price: 4500.55,
    Photo: 'assets/shoes.jpg'
  };
  public showImage = false;
  public btnText = 'Show';
  public TogglePreview() {
     this.showImage = (this.showImage==false)?true:false;
     this.btnText = (this.btnText=='Show')?'Hide':'Show';
  }

  constructor() { }

  ngOnInit(): void {
  }

}
