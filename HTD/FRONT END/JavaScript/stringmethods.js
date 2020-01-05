let message='good morning thuglaks'
//charCodeAt gives ascii value for the particular index             
console.log(message.charCodeAt(3))

//return the character in the specified index
console.log(message.charAt(2))

// let splitedmessage=message.split('').reverse().join('');
// let splitedmessage=message.split("  ");
let splitedmessage=message.split(" ");
console.log(splitedmessage)

//return whether the element present in the string
console.log(message.includes("good"));//returns boolean

console.log(message.toLowerCase());
console.log(message.toUpperCase());

console.log(message.substr(0,10))
console.log(message.length)

//using rest parameter
function add(...nums){
    let sum=0;
    for(num of nums){
        sum=sum+num;
    }
    console.log(sum)
}
add(31,32,23,25)

//destructuring
let student={
    name: "hema",
    id: 32,
    age: 21
};
let{name,id,...theRest}=student;
console.log(name);
console.log(id)
console.log(theRest)

//destructuring an array
let marks=[70,80,90,12,23]
let[maths,science,social,...rest]=marks;
console.log(maths)
console.log(science)
console.log(social)
console.log(rest)