let pwd:string = "admin123";
function PrintList(success:any, failure:any) {
    if(pwd=="admin123"){
        success();
    } else {
        failure();
    }
}
PrintList(function(){
    console.log('Login success..');
}, function(){
    console.log('Invalid Password');
})

