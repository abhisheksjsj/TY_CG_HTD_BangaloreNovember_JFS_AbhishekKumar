interface Trainee {
    name: string,
    age: number
    printData(): void
}

class Training implements Trainee {
    name = 'abc';
    age = 21;
    USN = 'asd123';
    marks = 99;
    aadharNo = 13625413265;
    panNo = 'wuy235';
    data() {
        console.log('')
    }
    printData() {
        console.log('hi');
    }
}



let trainee1: Trainee = {
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

}