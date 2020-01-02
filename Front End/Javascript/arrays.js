var technologies = ['HTML', 'CSS',
    'java', 'spring', 'hibernate', 'angular', 1234, true, null];

// console.log(technologies[6]);
// console.log(technologies);

// for(let technology of technologies){
//     console.log(technology);
// }

// for(let index in technologies){
//     console.log('index is ' +index + ' value is ' +technologies[index]);
// }

technologies.forEach((value, index) => {
    console.log(value);
    console.log
});

console.log('index of angular is ' + technologies.indexOf('angular'));

console.log('before pop ' + technologies);

technologies.pop();

//returns value in the last index and removes it

console.log('after pop ' + technologies);

console.log('before pushing the element ', technologies);

console.log(technologies.push('Spring boot', 'Spring rest'));

//add the element and returns the length
console.log('after pushing the element', technologies);

console.log('before shift', technologies);

console.log(technologies.shift());
//returns value in the index 0 and removes it

console.log('after shift', technologies);

console.log('before unshift', technologies);

console.log(technologies.unshift('HTML', 'CSS'));
//adds the element in the index 0 and returns length 

console.log('after unshift', technologies);

technologies.slice(2, 0, 'Bootstrap', 'javascript', 'java');

console.log(technologies);

console.log('splice applied to add few elements', technologies);

technologies.splice(technologies.indexOf(1234), 2);

console.log('after deleting unwanted elements', technologies);

//to find the length of the array
console.log(technologies.length);

//to reverse the array
// technologies.reverse();

// console.log('reversed array',technologies);

// let marks = [12,30,45,60,90,11,34,67,86];

// console.log(marks);

// //filtering array for marks greater than 40
// let filteredArray = marks.filter((value,index,array) => {
//     return value >40;
// });

//console.log(filteredArray);
// console.log(filteredArray.length);



let marks = [20, 20, 20, 30, 40, 40, 50, 60, 70, 70];

console.log(marks);

//filtering array for marks which are unique
let filteredArray = marks.filter((value, index, array) => {

    return array.indexOf(value) === index;

});

console.log(filteredArray);
console.log(filteredArray.length);

let myArray = marks.map((value,index,array) =>{
    return {ind: index, val: value};
});

console.log(myArray);



