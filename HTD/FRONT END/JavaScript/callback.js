// console.log('java script started')
// //setTimeOut() web-api asynchronous js
// setTimeout(function(){
//     console.log('10 seconds done')
// },10000);
// console.log('javascript ended')

// //setInterval() web-api asynchronous js
// var i=0;
// setInterval(function() {
//     i++;
//     console.log('1 second done')
// }, 1000);
// console.log('java script ended')

//fat arrow functions
var test=(a,b)=>{
    return a+b;
}
//for only one return statement(single asynchronous fat arrow functions)
var test1=(a,b)=>a*b;
console.log(test(12,12))
console.log(test1(2,3))
//we can skip paranthesis for only one argument
var demo =a => a*8;
console.log(demo(2));
//loop conditions (for,if)
//let keyword which is used as a block scope keyword
if(true){
    console.log('block scope')
    var a=100;
    let let=200;
    console.log(let)
}
console.log(a)
// console.log(let) it will throws an error because let is only used for block level