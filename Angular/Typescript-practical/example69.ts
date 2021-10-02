function Sum(a:any, b:any) {
    return a+b;
}
function Concat(a:any, b:any) {
    return `First Name=${a}\nLast Name=${b}`;
}

function PrintValue<T>(a:T, b:T):any{
    if((typeof a)=="number" && (typeof b=="number")){
        return Sum(a,b);
    } else {
        return Concat(a,b);
    }
}
console.log(PrintValue<number>(10,20));
console.log(PrintValue<string>("Tom","Hanks"));
