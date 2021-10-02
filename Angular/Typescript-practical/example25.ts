let products:string[] = ["TV","Mobile","Shoe"];
console.log(`To String: ${products.toString()}`);
console.log(`Join : ${products.join("-->")}`);
console.log(`Slice : ${products.slice(0,1)}`);
console.log(`Slice : ${products.slice(1,2)}`);//slice returns new array it does not effect parent array
console.log(`Slice : ${products.slice(2,3)}`);

var arr = ["orange", "mango", "banana", "sugar", "tea"];  
var removed = arr.splice(2, 0, "water");//adding water after index 2 and deleting no elements  
console.log("After adding 1: " + arr );  //splice method is the one that changes parent array
console.log("removed is: " + removed); 
          
removed = arr.splice(3, 1);//1 elements is removed after index 3  
console.log("After removing 1: " + arr );  
console.log("removed is: " + removed);

removed = arr.splice(3, 2); //2 elements are removed after index 3  
console.log("After removing 1: " + arr );  
console.log("removed is: " + removed);
