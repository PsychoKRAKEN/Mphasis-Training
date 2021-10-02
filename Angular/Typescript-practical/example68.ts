function PrintValue<T>(param:T):T
 {
    return param;
}
console.log(PrintValue<string>("String Value"));
console.log(PrintValue<number>(10));
