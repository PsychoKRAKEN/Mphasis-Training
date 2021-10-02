function GetData(obj) {
    if (obj instanceof Array) {
        for (var _i = 0, obj_1 = obj; _i < obj_1.length; _i++) {
            var item = obj_1[_i];
            console.log(item);
        }
    }
    else {
        for (var property in obj) {
            console.log(property + " : " + obj[property]);
        }
    }
}
var product = {
    Name: 'Nike Casuals',
    Price: 3400.44,
    InStock: true
};
var products = [
    { Name: "TV", Price: 45000.55, InStock: true },
    { Name: "Mobile", Price: 12000.33, InStock: false }
];
console.log("Products List:");
GetData(products);
console.log("--------------");
GetData(product);
