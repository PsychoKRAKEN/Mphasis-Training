// Password 4 to 15 chars alpha numberic with at least 1 uppercase letter
let password:string = "john123G@";
let regExp:any = /(?=.*[A-Z])\w{4,15}\@/;

if(password.match(regExp)) {
    console.log(`${password} - Strong Password`);
} else {
    if(password.length<4) {
        console.log(`${password} - Poor Password`);
    } else {
        console.log(`${password} - Weak Password`);
    }
}

//  -> / is used to differentiate special character from normal character
//(?=.*[!@#$%])   --> at least one special character
//(?=.*[A-Z]) --> one uppercase character
// ->   \@  --->particular special character

