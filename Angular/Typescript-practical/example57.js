function PrintList(list, sales, count) {
    for (var _i = 0, list_1 = list; _i < list_1.length; _i++) {
        var item = list_1[_i];
        console.log(item);
    }
    for (var _a = 0, sales_1 = sales; _a < sales_1.length; _a++) {
        var sale = sales_1[_a];
        console.log(sale);
    }
    console.log("Count = " + count);
}
PrintList(['A', 'B'], [10, 20], 2);
