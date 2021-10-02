var Employee = /** @class */ (function () {
    function Employee() {
    }
    return Employee;
}());
var emp = new Employee();
var product = new Array();
console.log("emp is instance of Array ? " + (emp instanceof Array) + "\nemp instance of Employee ? " + (emp instanceof Employee) + "\n Product instance of Array ? " + (product instanceof Array) + "\nProduct instance of Object? " + (product instanceof Object));
