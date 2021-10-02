interface IModel {
    ModelName:string;
}
interface IMemory {
    RAMsize:string;
}
interface ICamera {
    Mpx:string;
}
interface IMobile extends IModel, IMemory, ICamera {
    Print():void;
}
let mob:IMobile = {
    ModelName: "LG",
    RAMsize: "8GB",
    Mpx:"20px",
    Print:function (){
        console.log(`Name=${this.ModelName}\nRAM=${this.RAMsize}\nCamera=${this.Mpx}`);
    }    
}
mob.Print();
