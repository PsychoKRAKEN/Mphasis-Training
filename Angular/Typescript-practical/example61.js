function Message(str) {
    return str.toUpperCase();
}
function power(x, y) {
    return Math.pow(x, y);
}
var msg = Message("Welcome to TypeScript");
var pow = power(2, 3);
console.log(msg);
console.log(pow);
