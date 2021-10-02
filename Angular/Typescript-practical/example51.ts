class Database
{
    constructor(){
        console.log(`Connected to Database`);
    }
    public Insert(){
        console.log(`Record Inserted..`);
    }
}
let oracle = new Database;
oracle.Insert();

