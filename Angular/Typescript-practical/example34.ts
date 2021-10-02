let product:object = {
    Name:"",
    Price:0,
    InStock:true,
    Qty:0,
    Total:function(){
        return this.Qty * this.Price;
    },
    Print:function(){
        console.log(`Name=${this.Name}\nPrice=${this.Price}\nStock=${(this.InStock==true)?"Available":"Out of Stock"}\nQty=${this.Qty}\nTotal=${this.Total()}`);
    }
}
product.Name = "Samsung TV";
product.Price = 34000.55;
product.Qty = 2;
product.InStock = true;
product.Print();
console.log(`----------------`);
product.Name = "Nike Casuals";
product.Price = 3000.55;
product.Qty = 3;
product.InStock = false;
product.Print();
