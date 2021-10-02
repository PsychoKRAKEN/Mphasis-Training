let userName:string|null = prompt("Enter Name");
if(userName==null) {
    document.write(`You Canceled..`);
} else if(userName=="") {
    document.write(`Name can't be Empty`);
} else {
    document.write(`Hello ! ${userName}`);
}


/*
create a file home.html 
--------------------------------------
<head>
 <script src="example21.js"> </script>
 </head>

*/