let product = new Map([
    [1, "Samsung TV"],
    [2, "Nike Causuals"]
]);
// read all keys
console.log(`-------Keys---------`);
for(let key of Array.from(product.keys())){
    console.log(key);
}
//read all values
console.log(`-------Values-------`);
for(let value of Array.from(product.values())){
    console.log(value);
}
//read all entries
console.log(`--------Entries-------`);
for(let entry of Array.from(product.entries())){
    console.log(entry);
}
