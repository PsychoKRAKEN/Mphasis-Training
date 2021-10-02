var product = new Map([
    [1, "Samsung TV"],
    [2, "Nike Causuals"]
]);
// read all keys
console.log("-------Keys---------");
for (var _i = 0, _a = Array.from(product.keys()); _i < _a.length; _i++) {
    var key = _a[_i];
    console.log(key);
}
//read all values
console.log("-------Values-------");
for (var _b = 0, _c = Array.from(product.values()); _b < _c.length; _b++) {
    var value = _c[_b];
    console.log(value);
}
//read all entries
console.log("--------Entries-------");
for (var _d = 0, _e = Array.from(product.entries()); _d < _e.length; _d++) {
    var entry = _e[_d];
    console.log(entry);
}
