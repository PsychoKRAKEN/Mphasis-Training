var password = "admin123";
var Product = /** @class */ (function () {
    function Product() {
    }
    Object.defineProperty(Product.prototype, "ProductName", {
        get: function () {
            return this._productName;
        },
        set: function (newName) {
            if (password && password == "admin123") {
                this._productName = newName;
            }
            else {
                console.log("UnAuthorized : You are not authorized to set Product Name");
            }
        },
        enumerable: false,
        configurable: true
    });
    return Product;
}());
