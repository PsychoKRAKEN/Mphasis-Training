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
var ProductTemplate = /** @class */ (function () {
    function ProductTemplate() {
    }
    ProductTemplate.prototype.Total = function () {
        return this.Qty * this.Price;
    };
    return ProductTemplate;
}());
var Product = /** @class */ (function (_super) {
    __extends(Product, _super);
    function Product() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Product.prototype.Print = function () {
        _super.prototype.Name = "TV";
        _super.prototype.Price = 34500.55;
        _super.prototype.Qty = 2;
        console.log("Name=" + _super.prototype.Name + "\nPrice=" + _super.prototype.Price + "\nQty=" + _super.prototype.Qty + "\nTotal=" + _super.prototype.Total.call(this));
    };
    return Product;
}(ProductTemplate));
var tv = new Product();
tv.Print();
