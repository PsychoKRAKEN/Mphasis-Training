var product = {
    Name: "TV",
    Price: 34000.44,
    Qty: 3,
    Total: function () {
        return this.Qty * this.Price;
    }
};
console.log("Name=" + product.Name + "\nPrice=" + product.Price + "\nQty=" + product.Qty + "\nTotal=" + product.Total());
