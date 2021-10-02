function Product(Name:string, Price?:number){
    if(Price==undefined) {
        console.log(`Name=${Name}`);
    } else {
   console.log(`Name=${Name}\nPrice=${Price}`);
    }
}
Product("Samsung TV");  
console.log(`--------------`);
Product("Mobile", 12000);
