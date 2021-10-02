function Message(str):string {
    return str.toUpperCase();
}
function power(x,y):number {
    return Math.pow(x,y);
}
let msg:string = Message("Welcome to TypeScript");
let pow:number = power(2,3);
console.log(msg);
console.log(pow);
