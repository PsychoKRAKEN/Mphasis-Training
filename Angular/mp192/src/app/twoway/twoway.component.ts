import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twoway',
  templateUrl: './twoway.component.html',
  styleUrls: ['./twoway.component.css']
})
export class TwowayComponent implements OnInit {

  public name = 'Samsung TV';
  public city = 'Delhi';
  public inStock = true;
  public product = {
     Name: '',
    City: '',
    InStock: false
  };
  public UpdateClick() {
      this.product = {
      Name: this.name,
      City: this.city,
      InStock: this.inStock
    };
  }

  constructor() { }

  ngOnInit(): void {
  }

}
