let products:any = [
    {Name:"Samsung TV", Category:"Electronics"},
    {Name:"Nike Casuals", Category:"Footwear"},
    {Name:"Speakers", Category: "Electronics"},
    {Name:"Mobile", Category: "Electronics"}
];

let results = products.filter(product=>product.Category=="Electronics"&&product.Name=="Mobile");
let electronicsCount:number = products.filter(product=>product.Category=="Electronics"&&product.Name=="Mobile").length;
for(var item of results){
    console.log(item.Name);
}
console.log(`Total No of Electronic Products : ${electronicsCount}`);

