enum ErrorCode 
{
    NotFound = 404
}
let a = ErrorCode.NotFound;
console.log(`a = ${a}`);
let statusText = ErrorCode[a]; // revers mapping
console.log(`Status Text= ${statusText}`);
