interface IProduct
{
   Name:string;
   Price:number;
   Qty:number;
   Vendor?:string;
   Total():number;
}
let tv:IProduct = {
    Name:"TV",
    Price:34000.44,
    Qty:3,
    Total: function(){
        return this.Qty*this.Price;
    }
}
let mobile:IProduct = {
    Name:"Mobile",
    Price:12000.44,
    Qty:2,
    Vendor: "Samsung",
    Total: function(){
        return this.Qty*this.Price;
    }
}
function Print(obj) {
    console.log(`Name=${obj.Name}\nPrice=${obj.Price}\nQty=${obj.Qty}\nTotal=${obj.Total()}\nVendor=${(obj.Vendor==undefined)?"Anonymous Vendor":obj.Vendor}`);
}
Print(tv);
Print(mobile);
