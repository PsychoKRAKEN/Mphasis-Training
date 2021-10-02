import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})
export class ShoppingcartComponent implements OnInit {

  public products = [
    {Name: 'JBL Speaker', Photo: 'assets/jblspeaker.jpg', Likes: 0, Dislikes: 0},
    {Name: 'Nike Casuals', Photo: 'assets/shoes.jpg', Likes: 0, Dislikes: 0},
    {Name: 'Shirt', Photo: 'assets/shirt.jpg', Likes: 0, Dislikes: 0}
  ];
  public LikesCounter(item:any){
      item.Likes++;
  }
  public DislikesCounter(item:any){
       item.Dislikes++;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
