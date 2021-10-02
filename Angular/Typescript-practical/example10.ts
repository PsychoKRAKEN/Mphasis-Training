let email:string = "john@gmail.com";
if(email.indexOf("@")==-1) //-1 indecates not present
{
    console.error(`Error: Invalid email [@ Missing]`);
} else {
    console.log(`Your email ${email} Verified..`);
}
