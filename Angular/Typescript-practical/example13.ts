let mobile:string = "+919876543211";
let regExp:any = /\+91[0-9]{10}/;
if(mobile.match(regExp)) {
    console.log(`Your Mobile ${mobile} Verified`);
} else {
    console.log(`Invalid Mobile:+91 with 10 digits`);
console.log(mobile);
}
