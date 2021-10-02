function Print() {
    console.log("Print Function");
}
var Demo = /** @class */ (function () {
    function Demo() {
    }
    Demo.prototype.Print = function () {
        console.log('Print Method');
        Print(); // function call
    };
    return Demo;
}());
var obj = new Demo();
obj.Print();
