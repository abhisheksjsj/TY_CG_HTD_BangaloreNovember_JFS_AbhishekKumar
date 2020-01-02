// let message = 'good morning folks';

// // ASCII value of d
// console.log(message.charCodeAt(3));   

// //character present at 2 index
// console.log(message.charAt(2));

// //there is no special reverse() method to reverse the string.hence,so on......
// let splittedMessage = message.split('').reverse().join('');

// console.log(splittedMessage);

// //to check the string is present or not
// console.log(message.includes('morning'));

// console.log(message.includes('moring')); //returns boolean

// console.log(message.toLowerCase());

// console.log(message.toUpperCase());

// //the first argument is the starting index and the second index is the length
// console.log(message.substr(0,10));

// //to find the length of the String
// console.log(message.length);

// //using rest parameter
// function add(...nums) {
//     let sum=0;
//     for(let num of nums){
//         sum=sum+num;
//     }

//     console.log('Sum of number is ', sum);
// }

// add(12,23,45,67);

let student = {
    id: 1234,
    name: 'Abhishek',
    age: 22

};

let {id, name, ...theRest } = student;

console.log(name);
console.log(id);
console.log(theRest);

//array destructturing

let marks =[20,40,60,80,90];

let [maths,science, socialscience, ...rest] = marks;

console.log('math marks', maths);

console.log('science marks', science);

console.log('socialscience marks', socialscience);

console.log('rest of the marks', rest);

