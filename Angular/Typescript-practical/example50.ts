let password:string = "admin123";
class Product {
    private _productName:string;

    get ProductName():string {
        return this._productName;
    }
    set ProductName(newName:string) {
        if(password && password=="admin123") {
            this._productName = newName;
        } else {
            console.log(`UnAuthorized : You are not authorized to set Product Name`);
        }
    }
}
let tv = new Product();
tv.ProductName = "Samsung TV";
if(tv.ProductName==undefined) {
    console.log(`Name is Readonly for this User`);
} else {
console.log(`Name = ${tv.ProductName}`);
}
