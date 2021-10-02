var email = "john@gmail.com";
if (email.indexOf("@") == -1) {
    console.error("Error: Invalid email [@ Missing]");
}
else {
    console.log("Your email " + email + " Verified..");
}
