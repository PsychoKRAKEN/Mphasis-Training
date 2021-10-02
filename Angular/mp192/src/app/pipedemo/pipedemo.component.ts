import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipedemo',
  templateUrl: './pipedemo.component.html',
  styleUrls: ['./pipedemo.component.css']
})
export class PipedemoComponent {

  TutorialName0: string = 'Angular JS'; 
   appList0: string[] = ["Binding", "Display", "Services"]; 

   TutorialName: string = 'Angular JS'; 
  appList: string[] = ["Binding data", "Display device", "Services oriented"]; 
public product = {
  Name:'Samsung TV',
  Price:45000.50,
  Mfd:new Date('2021-02-02')}

  constructor() { }

  

}
