class Database
{
    constructor(dbName?:string){
        if(dbName==undefined){
            console.log(`Connected to Unknown Database..`);
        } else {
        console.log(`Connected to ${dbName} Database`);
        }
    }
    public Insert(){
        console.log(`Record Inserted..`);
    }
}
let oracle = new Database("Oracle");
oracle.Insert();
