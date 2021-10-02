var pwd = "admin123";
function PrintList(success, failure) {
    if (pwd == "admin123") {
        success();
    }
    else {
        failure();
    }
}
PrintList(function () {
    console.log('Login success..');
}, function () {
    console.log('Invalid Password');
});
