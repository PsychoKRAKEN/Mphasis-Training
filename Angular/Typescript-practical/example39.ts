let Mfd:any = new Date("2020-03-22");

let weekdays:string[] = ["Sunday","Mon","Tue","Wed","Thu","Fri","Sat"];
let months:string[] = ["January","Feb","March","April","May","June"];

console.log(`Manufactured Month=${months[Mfd.getMonth()]}\nWeekDay=${weekdays[Mfd.getDay()]}\nYear=${Mfd.getFullYear()}`);
console.log(`Manufactured=${Mfd.toDateString()}`);
