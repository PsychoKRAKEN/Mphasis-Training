let newArray:any[] = ["sandip","nitish",1,[4,5,4],5];
//newArray[0] = "sandip";
newArray[1] = "John";
//newArray[2] = true;
//newArray[3] = ["A", "B"];
//newArray[4] = function(){
  //  console.log("Function in Array");
//};
for(var item of newArray[3]) {
    console.log(item);
}
console.log(newArray[3]);
console.log(newArray[0]);
console.log(newArray[1]);

//newArray[4]();
