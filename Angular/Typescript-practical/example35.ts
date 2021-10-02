let data:any[] = [
    {Name: "TV", Price: 30000.44, Category: "Electronics"},
    {Name: "Shirt", Price:3100.33, Category: "Fashion"},
    {Name: "Mobile", Price:12000.33, Category: "Electronics"},
    {Name: "Nike Casuals", Price: 5000.55, Category: "Footwear"}
];
let searchResults:any[] = data.filter(function(x)
{
    return x.Category=="Electronics" || x.Category=="Fashion";
})
for(var obj of searchResults) {
    console.log(`${obj.Name} - ${obj.Price}`);
}
