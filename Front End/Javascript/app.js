//console.log("Hi from external JS");

//variable declaration
var a;

//variable initialisation
a = 100;

console.log('value of a is ' + a);

console.log(typeof a);

var name = "Abhishek";
console.log(name);
console.log(typeof name);

var age = 22;

//using templte literals with embedded expressions
var details = `The name is ${name} and age is ${age}`
console.log(details);

console.log(`the Sum of 10 and 11 is ${10 + 11}`);

//having multiple line strings
var sampleText = `
 Lorem ipsum qjwsgdjg dasjgcjkdafcukaj sgfdsjkgfiusd jujagduijsgfd kjkafghdciuksgik `;

console.log(sampleText);

var icompassCleared = true;

console.log(typeof icompassCleared);

var empty = null;
console.log(typeof empty);

//  if(null==undefined) {
//      console.log('true block');

//  }else{
//      console.log('false block');

//  }


//  alert('Are you Fine?');

//  var userConfirmation = confirm('Are you sure want to proceed?');

//  console.log(userConfirmation);

//  if (userConfirmation) {
//      console.log('The user selected OK');
//  } else {
//      console.log('User cancelled the operation');
//  }

//  var userInput = prompt('Please enter your name');

//  console.log(userInput);

//document.write('Javascript is a scripting as well as programming language');
//functions
//naming function


// var a= 'xyz';

// function demo(){
//     console.log(a);
//     var b=100;
//     console.log('function demo is being called');
// }

//console.log(b);     //throws error b is not defined
//it is a local scoped variable
// demo();

// function add(a,b){
//     return a+b;
// }

// console.log(add(1,2));

// var test =function() {
//     console.log('anonymous function assigned to variable test');
// }

// test();

// (function demo1() {
//     var myName = 'Abhishek';
//     console.log(a+b);
//     console.log('inside the function',myName);
//     console.log('IIFE running');
// })(12,23);

// console.log('outside function', myName);

// function sample(x){
//     console.log('sample function started');
//     x();
//     console.log('sample function ended');
// }

// sample(function(){
//     console.log('Callback function running');
// });

let marks = [12, 45, 54, 23, 34, 67, 53, 78, 90, 63];

let ascendingOrderOfMarks = marks.sort((a, b) => {
    return a - b;
});

console.log('in ascending order', ascendingOrderOfMarks);

let descendingOrderOfMarks = marks.sort((a, b) => {
    return b - a;

});

console.log('in descending order', descendingOrderOfMarks);

