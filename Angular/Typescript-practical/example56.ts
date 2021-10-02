function PrintList(list:string[]){
    for(var item of list) {
        console.log(item);
    }
}
PrintList(['TV', 'Mobile']);
console.log(`--------------`);
PrintList(new Array('Shoe','Watch'));
console.log(`--------------`);
let categories:string[] = ['Electronics', 'Footwear'];
PrintList(categories);
