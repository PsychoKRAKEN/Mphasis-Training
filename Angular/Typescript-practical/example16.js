var msg = "SamsungTV,45000.55,InStock";
var data = msg.split(',');
for (var _i = 0, data_1 = data; _i < data_1.length; _i++) {
    var value = data_1[_i];
    console.log(value);
}
console.log("Name=" + data[0]);
