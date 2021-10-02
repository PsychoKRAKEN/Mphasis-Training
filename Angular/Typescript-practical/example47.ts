interface IModel {
    ModelName:string;
}
interface IMemory extends IModel {
    RAMsize:string;
}
interface ICamera extends IMemory {
    Mpx:string;
}
interface IMobile extends ICamera {
    Print():void;
}
let mob:IMobile = {
    ModelName: "Samsung",
    RAMsize: "8GB",
    Mpx:"20px",
    Print:function (){
        console.log(`Name=${this.ModelName}\nRAM=${this.RAMsize}\nCamera=${this.Mpx}`);
    }    
}
mob.Print();
