class Demo<T> {
    value:T;
    add:(x:T, y:T)=>T;
}
let obj = new Demo<number>();
obj.value = 10;
obj.add = function(x, y) { return x + y };
console.log(`Number=${obj.value}`);
console.log(`Addition=${obj.add(10,20)}`);

let obj2 = new Demo<string>();
obj2.value = "Hello !";
obj2.add = function(x, y) { return `${x} ${y}`};
console.log(obj2.value);
console.log(obj2.add("Raj", "Kumar"));
