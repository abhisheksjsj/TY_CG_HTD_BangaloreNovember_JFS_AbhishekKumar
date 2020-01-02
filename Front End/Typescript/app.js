"use strict";
console.log('Typescript code started');
var a = 100;
a = null; //change in the json file as "strictNullChecks":false
//a='string';      //error....we cannot reassign type number to string
var b; //implicitly considered as any datatype
b = 100;
b = 'Abhishek';
console.log(b);
var marks = [1, 3, 4, 6, 8]; //only number datatype
var student;
student = {
    name: 'ABC',
    age: 22,
    pass: true
};
console.log(student);
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 'abc';
    }
    return Sample;
}());
var sample = new Sample();
console.log(sample.a);
console.log(sample.b);
// class Student {
//     constructor(
//         public name: string,
//         public age: number,
//         public USN: string,
//         public marks: number) {
//     }
// printDetails(): void {
//     console.log(`
//     Nmae is ${this.name},
//     Age is: ${this.age},
//     USN is:${this.USN},
//     Marks is:${this.marks}
//     `);
// }
//}
// let student1 = new Student('Abhishek', 22, 'qwerty', 101);
// console.log(student1);
console.log('Typescript code ended');
