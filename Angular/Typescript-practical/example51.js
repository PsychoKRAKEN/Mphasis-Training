var Database = /** @class */ (function () {
    function Database() {
        console.log("Connected to Database");
    }
    Database.prototype.Insert = function () {
        console.log("Record Inserted..");
    };
    return Database;
}());
var oracle = new Database;
oracle.Insert();
