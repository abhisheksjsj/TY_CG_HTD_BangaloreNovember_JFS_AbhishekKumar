class Student {
    constructor(
        public name: string,
        public age: number,
        public USN: string,
        public marks: number,
        public aadharNo?: number,
        public panNo?: string) {
    }
}

let student1: Student = {
    name: 'Abhishek Kumar',
    age: 22,
    USN: 'qwy25436',
    marks: 67
}

let student2 = new Student(
    'Anshuman', 30, 'Anshu123', 12, undefined, 'HJHG1234643'
);

let clearedStudents = [
    new Student('Abhishek', 22, 'abcd12', 70),
    new Student('Vivek', 23, 'vivek123', 85)
];
console.log(clearedStudents);