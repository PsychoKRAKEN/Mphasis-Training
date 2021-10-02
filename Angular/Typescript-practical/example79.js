var ErrorCode;
(function (ErrorCode) {
    ErrorCode[ErrorCode["NotFound"] = 404] = "NotFound";
})(ErrorCode || (ErrorCode = {}));
var a = ErrorCode.NotFound;
console.log("a = " + a);
var statusText = ErrorCode[a]; // revers mapping
console.log("Status Text= " + statusText);
