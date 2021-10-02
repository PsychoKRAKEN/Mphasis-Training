function Demo(param):number | string {
    if((typeof param)=="number") {
        return param + 1;
    } else {
        return `Your Message : ${param}`;
    }
}
console.log(Demo(10));
console.log(Demo("Welcome to TypeScript"));
