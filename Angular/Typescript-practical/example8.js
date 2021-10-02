var className = 'bttns-primary';
if (className.startsWith("form")) {
    console.log("You Defined a Form Class");
}
else if (className.startsWith("btn")) {
    console.log("You Defined a Button Class");
}
else {
    console.log("You are using Miscelaneous class " + className);
}
