"use strict";
var Training = /** @class */ (function () {
    function Training() {
        this.name = 'abc';
        this.age = 21;
        this.USN = 'asd123';
        this.marks = 99;
        this.aadharNo = 13625413265;
        this.panNo = 'wuy235';
    }
    Training.prototype.data = function () {
        console.log('');
    };
    Training.prototype.printData = function () {
        console.log('hi');
    };
    return Training;
}());
var trainee1 = {
    name: 'Rahul',
    age: 21,
    USN: 'AJD236',
    printData: function () {
        console.log(this.name, this.age);
    },
    marks: 32,
    aadharNo: 5643642745,
    panNo: 'IQWGD32671',
    data: function () {
        console.log('data function');
    }
};
