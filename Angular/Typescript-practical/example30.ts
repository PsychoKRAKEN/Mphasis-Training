let categories:string[] = ["Electronics","Fashion","Footwear"];

function PrintList(){
    for(var property in categories) {
        console.log(`${property}:${categories[property]}`);
    }
}
PrintList();
let removedItem:string[] = categories.splice(1,1);
console.log(`${removedItem[0]} Removed From Collection`);
PrintList();
