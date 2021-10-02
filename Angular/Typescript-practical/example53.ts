function Print(){
  console.log(`Print Function`);
}
class Demo {
  Print() {     // method
      console.log('Print Method');
      Print();  // function call
  }
}
let obj = new Demo();
obj.Print();
