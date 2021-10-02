let data:any[] = [
    {Name: "TV", Price: 30000.44, Category: "Electronics", ShippedTo: ["Delhi","Hyd"]},
    {Name: "Shirt", Price:3100.33, Category: "Fashion", ShippedTo: ["Hyd","Mumbai"]},
    {Name: "Mobile", Price:12000.33, Category: "Electronics", ShippedTo:["Chennai","Hyd"]},
    {Name: "Nike Casuals", Price: 5000.55, Category: "Footwear", ShippedTo: ["Hyd","Mumbai"]}
];
let searchResults:any[] = data.filter(obj=>obj.Category=="Electronics");

for(var obj of searchResults) 
{
    console.log(`${obj.Name} - ${obj.Price} - ${obj.ShippedTo.toString()}`);
}
