var userName = prompt("Enter Name");
if (userName == null) {
    document.write("You Canceled..");
}
else if (userName == "") {
    document.write("Name can't be Empty");
}
else {
    document.write("Hello ! " + userName);
}
