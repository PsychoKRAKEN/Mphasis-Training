function PrintList(list:string[], sales:number[], count:number){
    for(var item of list) {
        console.log(item);
    }
    for(var sale of sales){
        console.log(sale);
    }
    console.log(`Count = ${count}`)
}
PrintList(['A','B'],[10,20],2);
