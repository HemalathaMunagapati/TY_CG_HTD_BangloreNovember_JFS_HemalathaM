// console.log("this is external js");
//variable declaration

var a;
//variable initialization
a=10;
console.log("value of a="+a);
console.log(typeof(a));

var name="hems";
// console.log("my name is"=+name);
console.log("my name "+name)
console.log('me=='+name);
console.log(`name of the string:`+name);
console.log(typeof(name));

var age=21;

//string interpolation
var details=`the name is ${name} and age is ${age}`;
console.log(details)
console.log(`and roll number is ${10+21}`)

var sampleText=`Lorem ipsum dolor, sit amet consectetur adipisicing elit. Sunt beatae et nisi ullam perferendis neque soluta voluptas cum. 
Iusto porro quisquam dolor numquam distinctio nostrum molestias! Harum rem libero ad?`

console.log(sampleText)
console.log(typeof(sampleText))

var icompasscleared=true;
console.log(icompasscleared)
console.log(typeof(icompasscleared))
//undefined type
var b;
console.log(typeof(b))

//null
var empty=null;
console.log(typeof(null))

//strict equals
if(true === `true`){
    console.log("true block")
}else{
    console.log("false block")
}

//equals operator
if(true == `true`){
    console.log("true block")
}else{
    console.log("false block")
}

if(null==undefined){
    console.log("true block")
}else{
    console.log("false block")
}

if(null===-+undefined){
    console.log("true block")
}else{
    console.log("false block")
}

//alert is an window object
//using alert() we can display popups to the user
alert('Are you fine');

//confirm is used to dispaly ok(true condition) and cancel(false condition)
var userconfirms=confirm("you need help..!!")
console.log(userconfirms);
if(userconfirms){
    console.log("user needs help..do do some operations")
}else{
    console.log("user rejects our help..")
}

//prompt() used to get the input from the user
var opinion=prompt("user page..WELCOME")
console.log(opinion)

//document
document.write("Welcome to the javascript world")

//functions
//global variable
var gv=3;
function demo(){
    //functional scope
    var fs=8;
    console.log('function demo is being caaled')
}
demo();
//it will throws an error when we call functional scope out of the function
// console.log(fs);

function add(a, b){
 return a+b;
}
console.log(add(23,32))

//anonymous functions along with function Expression
var test=function(){
    console.log("This is a anonymous function and function expression")
} 
test();

//immediate invoke function expression
(function demo1(a,b){
    var me="hema";
    console.log("inside the function"+me);
    console.log("running")

})(12,13);
//the below method will throws an error because it not invoking after immediate function expression
// console.log("outside the function:"+me)

//callback function
function sample(x){
    console.log("sample function started")
    x();
    console.log("sample function ended")
}

sample(function(){
    console.log(`callback function is running`)
});
