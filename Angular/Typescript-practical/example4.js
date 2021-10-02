function f1() {
    x = 10;
    console.log("x=" + x);
    var x; // x is hoisted
}
f1();
