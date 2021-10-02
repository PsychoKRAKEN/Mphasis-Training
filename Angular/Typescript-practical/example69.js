function Sum(a, b) {
    return a + b;
}
function Concat(a, b) {
    return "First Name=" + a + "\nLast Name=" + b;
}
function PrintValue(a, b) {
    if ((typeof a) == "number" && (typeof b == "number")) {
        return Sum(a, b);
    }
    else {
        return Concat(a, b);
    }
}
console.log(PrintValue(10, 20));
console.log(PrintValue("Tom", "Hanks"));
