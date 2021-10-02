var data = [
    { Name: "TV", Price: 30000.44, Category: "Electronics", ShippedTo: ["Delhi", "Hyd"] },
    { Name: "Shirt", Price: 3100.33, Category: "Fashion", ShippedTo: ["Hyd", "Mumbai"] },
    { Name: "Mobile", Price: 12000.33, Category: "Electronics", ShippedTo: ["Chennai", "Hyd"] },
    { Name: "Nike Casuals", Price: 5000.55, Category: "Footwear", ShippedTo: ["Hyd", "Mumbai"] }
];
var searchResults = data.filter(function (obj) { return obj.Category == "Electronics"; });
for (var _i = 0, searchResults_1 = searchResults; _i < searchResults_1.length; _i++) {
    var obj = searchResults_1[_i];
    console.log(obj.Name + " - " + obj.Price + " - " + obj.ShippedTo.toString());
}
