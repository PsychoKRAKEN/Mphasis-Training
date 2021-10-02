let word:string = "color";
let regExp:any = /colou?rw?/;
if(word.match(regExp)){
    console.log(`Your Spelling ${word} is Valid`);
} else {
    console.log(`Your Spelling ${word} is incorrect [color or colour] is valid`);
}
