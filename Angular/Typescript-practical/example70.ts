interface IProduct
 {
    Name:string;
    Price:number;
    InStock:boolean;
}
interface IEmployee 
{
    Name: string;
    Designation:string;
}
function GetData<T>(obj:T) {
    for(var property in obj) {
        console.log(`${property} : ${obj[property]}`);
    }
}
console.log(`Product Details:`);
GetData<IProduct>({Name: 'TV', Price: 34000.44, InStock: true});
console.log(`----------------`);
GetData<IEmployee>({Name: 'John', Designation: 'Manager'});
