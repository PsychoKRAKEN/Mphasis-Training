function f1() {
  var x = 10;
  if(x==10) 
{
      var y=20;
      var y=30;	// y - shadowing
  }
  console.log(`x=${x}\n y=${y}`);
}
f1();
