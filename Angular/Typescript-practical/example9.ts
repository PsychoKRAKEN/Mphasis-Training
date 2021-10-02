let className:string = 'text-primary';
if(className.endsWith("center")) {
    console.log(`You Defined an Alignment Class`);
} else if(className.endsWith("primary")) {
    console.log(`You Defined Contextual Class`);
} else {
    console.log(`You are using Miscelaneous class ${className}`);
}
