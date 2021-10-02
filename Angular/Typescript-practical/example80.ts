interface IProduct 
{
    Name:string;
    Price:number;
    Qty:number;
    Total():number;
    Print():void;
}
abstract class ProductTemplate implements IProduct
{
    public Name:string;
    public Price:number;
    public Qty:number;
    public Total():number {
        return this.Qty * this.Price;
    }
    public abstract Print():void;
}
class Product extends ProductTemplate
{
    public Print():void {
        super.Name = "TV";
        super.Price = 34500.55;
        super.Qty = 2;
        console.log(`Name=${super.Name}\nPrice=${super.Price}\nQty=${super.Qty}\nTotal=${super.Total()}`);
    }
}
let tv = new Product();
tv.Print();
