var person = {
    aadharNo: 456454646474
}
var personPan = {
    pan: 'DYTRE5264'
}

var student = {
    ...personPan,
    ...person,
    id: 1234,
    name: 'Abhishek Kumar',
    degree: 'B.Tech Graduate',
    phone: 9876543210,
    address: {
        city:'bangalore',
        state:'Karnataka',
        pincode: 560076
    }
}

for(let key in student) {
    console.log(key + ' ::: ' +student[key]);
}


// console.log(student.id);
// console.log(student.name);
// console.log(student['degree']);
// console.log(person.aadharNo);
// console.log(student);
// console.log(person);
// console.log(personPan);
