let page:string ="about.html";
let msg:string|number;
if(page=="home.html"){
   msg=`You requested for ${page} page`;
} else {
    msg = 404;
}
if(msg==400) {
    msg = "Bad Request";
} else if (msg==404) {
    msg = "Not Found";
}
console.log(msg);
