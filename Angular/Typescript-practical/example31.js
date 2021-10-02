var values = ["A", "D", "C", "B"];
function PrintList() {
    for (var property in values) {
        console.log(property + ":" + values[property]);
    }
}
values.sort();
console.log("------Sorted List-----");
PrintList();
values.reverse();
console.log("------Reversed List-----");
PrintList();
