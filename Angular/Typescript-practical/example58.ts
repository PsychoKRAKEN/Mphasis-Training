function PrintList(count:number, ...list:any) {
    for(var item of list) {
        console.log(item);
    }
    console.log(`Count=${count}`);
}
PrintList(2,"TV",true)
