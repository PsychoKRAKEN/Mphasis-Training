let categories:string[] = ["Electronics","Fashion","Footwear"];
function PrintList(){
    for(var property in categories) {
        console.log(`${property}:${categories[property]}`);
    }
}
PrintList();
let removedItem:string = categories.shift();
console.log(`${removedItem} Removed From Collection`);
PrintList();
