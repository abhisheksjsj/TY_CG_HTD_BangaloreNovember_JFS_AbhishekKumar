"use strict";
var Student = /** @class */ (function () {
    function Student(name, age, USN, marks, aadharNo, panNo) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }
    return Student;
}());
var student1 = {
    name: 'Abhishek Kumar',
    age: 22,
    USN: 'qwy25436',
    marks: 67
};
var student2 = new Student('Anshuman', 30, 'Anshu123', 12, undefined, 'HJHG1234643');
var clearedStudents = [
    new Student('Abhishek', 22, 'abcd12', 70),
    new Student('Vivek', 23, 'vivek123', 85)
];
console.log(clearedStudents);
