var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.Print = function () {
        console.log(this.FirstName + " " + this.LastName + " - " + this.Designation);
    };
    return Employee;
}());
var Developer = /** @class */ (function (_super) {
    __extends(Developer, _super);
    function Developer() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Developer.prototype.Print = function () {
        _super.prototype.FirstName = "Raj";
        _super.prototype.LastName = "Kumar";
        _super.prototype.Designation = "Developer";
        _super.prototype.Print.call(this);
    };
    return Developer;
}(Employee));
var Admin = /** @class */ (function (_super) {
    __extends(Admin, _super);
    function Admin() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Admin.prototype.Print = function () {
        _super.prototype.FirstName = "Kiran";
        _super.prototype.LastName = "Kumar";
        _super.prototype.Designation = "Admin";
        _super.prototype.Print.call(this);
    };
    return Admin;
}(Employee));
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Manager.prototype.Print = function () {
        _super.prototype.FirstName = "Tom";
        _super.prototype.LastName = "Hanks";
        _super.prototype.Designation = "Manager";
        _super.prototype.Print.call(this);
    };
    return Manager;
}(Employee));
var employees = new Array();
employees[0] = new Developer();
employees[1] = new Admin();
employees[2] = new Manager();
for (var _i = 0, employees_1 = employees; _i < employees_1.length; _i++) {
    var emp = employees_1[_i];
    emp.Print();
}
