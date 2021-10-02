let products:string[] = ["TV","Mobile","Shoe"];
let data:any[] = [
    {Name: "TV", Price: 45000.55},
    {Name: "Mobile", Prie: 30000.44}
];
for(var product of products) {
    console.log(product);
}
for(var item of data) {
    console.log(item);
}
