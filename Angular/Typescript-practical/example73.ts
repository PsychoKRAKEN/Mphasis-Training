class Oracle {
    connection:string;
    query:string;
    connectionState:string;
}
class MongoDb {
    connection:string;
    command:string;
}
class DataSource<T> {
    connection:T;
}
let ora = new DataSource<Oracle>();
ora.connection = {connection:"OracleConnection", query:"Select * from tblproducts", connectionState:"Connected"};
console.log(`Provider=${ora.connection.connection}\nQuery=${ora.connection.query}\nConnection State=${ora.connection.connectionState}`);

console.log(`--------------------`)
let mongo = new DataSource<MongoDb>();
mongo.connection = { connection:"Mongoose", command: "db.tblproducts.insert()" };
console.log(`Provider=${mongo.connection.connection}\nCommand=${mongo.connection.command}`);
