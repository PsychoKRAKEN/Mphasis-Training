var categories = ["Electronics", "Fashion"];
function PrintList() {
    for (var property in categories) {
        console.log(property + ":" + categories[property]);
    }
}
PrintList();
categories.splice(2, 2, "Mobiles", "Footwear");
console.log("---New Categories Added----");
PrintList();
