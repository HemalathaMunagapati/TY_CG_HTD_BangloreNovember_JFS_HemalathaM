var date=new Date();
console.log(date.getDate());
console.log(date.getMonth())
console.log(date.getFullYear())
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getMilliseconds());

setInterval(()=>
{
    let date=new Date();
    document.getElementById('todaysDate').innerText=
    `Date ::: ${date.getDate()}-${date.getMonth()+1}-${date.getFullYear()}
    Time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}:${date.getMilliseconds()}`
},1);