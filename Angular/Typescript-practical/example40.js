var Mfd = new Date("2020-03-22");
var weekdays = ["Sunday", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
var months = ["January", "Feb", "March", "April", "May", "June"];
Mfd.setFullYear(2021);
Mfd.setMonth(5);
console.log("Manufactured Month=" + months[Mfd.getMonth()] + "\nWeekDay=" + weekdays[Mfd.getDay()] + "\nYear=" + Mfd.getFullYear());
console.log("Manufactured=" + Mfd.toDateString());
