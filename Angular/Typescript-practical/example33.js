var Factory = [function (a, b) { return a + b; }, function (a, b) { return a * b; }];
var Add = Factory[0], Mul = Factory[1];
console.log("Addition=" + Add(10, 20) + "\nMultiply=" + Mul(5, 4));
