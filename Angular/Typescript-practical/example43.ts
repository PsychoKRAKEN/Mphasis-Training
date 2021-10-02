let product:any = {
    Name: "TV",
    Price: 34000.44
};
delete product.Price;
if(product.Price==undefined) {
    console.log(`Name=${product.Name}`);
} else {
console.log(`Name=${product.Name}\nPrice=${product.Price}`);
}
