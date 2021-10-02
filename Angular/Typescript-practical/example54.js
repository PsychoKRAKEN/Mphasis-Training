var products = [
    { Name: "Samsung TV", Category: "Electronics" },
    { Name: "Nike Casuals", Category: "Footwear" },
    { Name: "Speakers", Category: "Electronics" },
    { Name: "Mobile", Category: "Electronics" }
];
var results = products.filter(function (product) { return product.Category == "Electronics" && product.Name == "Mobile"; });
var electronicsCount = products.filter(function (product) { return product.Category == "Electronics" && product.Name == "Mobile"; }).length;
for (var _i = 0, results_1 = results; _i < results_1.length; _i++) {
    var item = results_1[_i];
    console.log(item.Name);
}
console.log("Total No of Electronic Products : " + electronicsCount);
