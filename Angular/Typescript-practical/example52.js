var Database = /** @class */ (function () {
    function Database(dbName) {
        if (dbName == undefined) {
            console.log("Connected to Unknown Database..");
        }
        else {
            console.log("Connected to " + dbName + " Database");
        }
    }
    Database.prototype.Insert = function () {
        console.log("Record Inserted..");
    };
    return Database;
}());
var oracle = new Database("Oracle");
oracle.Insert();
