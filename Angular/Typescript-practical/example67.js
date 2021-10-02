var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.calculate = function (num1, num2) { };
    ;
    Calculator.calculateTest = function (num1, num2, type) {
        var objs = new Array();
        objs[0] = new Addtion();
        objs[1] = new Mul();
        var add = objs[0], mul = objs[1];
        var obj = eval(type);
        obj.calculate(num1, num2);
    };
    return Calculator;
}());
var Addtion = /** @class */ (function (_super) {
    __extends(Addtion, _super);
    function Addtion() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Addtion.prototype.calculate = function (num1, num2) {
        console.log(num1 + num2);
    };
    return Addtion;
}(Calculator));
var Mul = /** @class */ (function (_super) {
    __extends(Mul, _super);
    function Mul() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Mul.prototype.calculate = function (num1, num2) {
        console.log(num1 * num2);
    };
    return Mul;
}(Calculator));
Calculator.calculateTest(5, 7, "mul");
Calculator.calculateTest(5, 7, "add");
