var Demo = /** @class */ (function () {
    function Demo() {
    }
    return Demo;
}());
var obj = new Demo();
obj.value = 10;
obj.add = function (x, y) { return x + y; };
console.log("Number=" + obj.value);
console.log("Addition=" + obj.add(10, 20));
var obj2 = new Demo();
obj2.value = "Hello !";
obj2.add = function (x, y) { return x + " " + y; };
console.log(obj2.value);
console.log(obj2.add("Raj", "Kumar"));
