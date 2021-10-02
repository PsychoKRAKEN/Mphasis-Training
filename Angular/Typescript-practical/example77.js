var ErrorCodes;
(function (ErrorCodes) {
    ErrorCodes[ErrorCodes["OK"] = 200] = "OK";
    ErrorCodes[ErrorCodes["Created"] = 201] = "Created";
    ErrorCodes[ErrorCodes["Accepted"] = 202] = "Accepted";
    ErrorCodes[ErrorCodes["NonAuthorative"] = 203] = "NonAuthorative";
    ErrorCodes[ErrorCodes["NoContent"] = 204] = "NoContent";
})(ErrorCodes || (ErrorCodes = {}));
console.log("NoContent Status Code: " + ErrorCodes.NoContent);
