import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fordemo',
  templateUrl: './fordemo.component.html',
  styleUrls: ['./fordemo.component.css']
})
export class FordemoComponent implements OnInit {

  public categories = ['Electronics', 'Footwear', 'Fashion'];
  public menudata = [
    {Category: 'Electronics', Products: ['Samsung TV', 'JBL Speaker']},
    {Category: 'Footwear', Products: ['Nike Casuals', 'Lee Cooper Boot']},
    {Category: 'Fashion', Products: ['Addidas', 'Nike']}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
