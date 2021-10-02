var Oracle = /** @class */ (function () {
    function Oracle() {
    }
    return Oracle;
}());
var MongoDb = /** @class */ (function () {
    function MongoDb() {
    }
    return MongoDb;
}());
var DataSource = /** @class */ (function () {
    function DataSource() {
    }
    return DataSource;
}());
var ora = new DataSource();
ora.connection = { connection: "OracleConnection", query: "Select * from tblproducts", connectionState: "Connected" };
console.log("Provider=" + ora.connection.connection + "\nQuery=" + ora.connection.query + "\nConnection State=" + ora.connection.connectionState);
console.log("--------------------");
var mongo = new DataSource();
mongo.connection = { connection: "Mongoose", command: "db.tblproducts.insert()" };
console.log("Provider=" + mongo.connection.connection + "\nCommand=" + mongo.connection.command);
