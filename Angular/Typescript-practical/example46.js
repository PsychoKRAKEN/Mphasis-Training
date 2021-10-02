var tv = {
    Name: "TV",
    Price: 34000.44,
    Qty: 3,
    Total: function () {
        return this.Qty * this.Price;
    }
};
var mobile = {
    Name: "Mobile",
    Price: 12000.44,
    Qty: 2,
    Vendor: "Samsung",
    Total: function () {
        return this.Qty * this.Price;
    }
};
function Print(obj) {
    console.log("Name=" + obj.Name + "\nPrice=" + obj.Price + "\nQty=" + obj.Qty + "\nTotal=" + obj.Total() + "\nVendor=" + ((obj.Vendor == undefined) ? "Anonymous Vendor" : obj.Vendor));
}
Print(tv);
Print(mobile);
