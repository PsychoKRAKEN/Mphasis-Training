let Factory:any[] = [function(a,b){return a+b},function(a,b){return a*b}];
let [Add, Mul] = Factory;
console.log(`Addition=${Add(10,20)}\nMultiply=${Mul(5,4)}`);
