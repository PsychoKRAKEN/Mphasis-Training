interface IProduct
{
   Name:string;
   Price:number;
   Qty:number;
   Total():number;
}
let product:IProduct = {
    Name:"TV",
    Price:34000.44,
    Qty:3,
    Total: function(){
        return this.Qty*this.Price;
    }
}
console.log(`Name=${product.Name}\nPrice=${product.Price}\nQty=${product.Qty}\nTotal=${product.Total()}`)
