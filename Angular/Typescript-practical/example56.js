function PrintList(list) {
    for (var _i = 0, list_1 = list; _i < list_1.length; _i++) {
        var item = list_1[_i];
        console.log(item);
    }
}
PrintList(['TV', 'Mobile']);
console.log("--------------");
PrintList(new Array('Shoe', 'Watch'));
console.log("--------------");
var categories = ['Electronics', 'Footwear'];
PrintList(categories);
