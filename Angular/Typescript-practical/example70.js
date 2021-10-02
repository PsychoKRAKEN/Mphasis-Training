function GetData(obj) {
    for (var property in obj) {
        console.log(property + " : " + obj[property]);
    }
}
console.log("Product Details:");
GetData({ Name: 'TV', Price: 34000.44, InStock: true });
console.log("----------------");
GetData({ Name: 'John', Designation: 'Manager' });
