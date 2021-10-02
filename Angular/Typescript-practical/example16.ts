let msg:string = "SamsungTV,45000.55,InStock";
let data:string[] = msg.split(',');
for(var value of data) {
    console.log(value);
}
console.log(`Name=${data[0]}`);
