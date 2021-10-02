var categories = ["Electronics", "Fashion", "Footwear"];
function PrintList() {
    for (var property in categories) {
        console.log(property + ":" + categories[property]);
    }
}
PrintList();
var removedItem = categories.pop();
console.log(removedItem + " Removed From Collection");
PrintList();
