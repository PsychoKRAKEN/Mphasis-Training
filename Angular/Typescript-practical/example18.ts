let Name:string = "Samsung TV";
let Price:number = 45000.55;
//let isInStock:boolen = true;
//console.log(`Name=${Name}\nPrice=${Price}\nStock=${(isInStock==true)?"Available":"Out of Stock"}`);

let isInStock:string = "empty";
console.log(`Name=${Name}\nPrice=${Price}\nStock=${(isInStock=="true")?"Stock Available":`(${(isInStock=="Full")?"Stock Full":"Stock Empty"})`}`);  
