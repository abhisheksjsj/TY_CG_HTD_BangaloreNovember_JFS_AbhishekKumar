

// console.log(date.getDate());
// console.log(date.getMonth());
// console.log(date.getMonth() + 1);
// console.log(date.getFullYear);
// console.log(date.getHours);
// console.log("minutes", date.getMinutes());
// console.log("milliseconds", date.getMilliseconds);

setInterval(() => {
    var date = new Date();

    //console.log('method called');
    document.getElementById('todaysDate').innerHTML = `
    Date ::: ${date.getDate()}-${date.getMonth() + 1}-${date.getFullYear()}::: 
    Time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}:${date.getMilliseconds()}`
}, 1000);

 
