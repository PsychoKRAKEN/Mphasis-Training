var mobile = "+9198765432111";
var regExp = /\+91[0-9]{10}/;
if (mobile.match(regExp)) {
    console.log("Your Mobile " + mobile + " Verified");
}
else {
    console.log("Invalid Mobile:+91 with 10 digits");
    console.log(mobile);
}
