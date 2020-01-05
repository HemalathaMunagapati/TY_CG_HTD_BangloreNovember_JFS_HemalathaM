class Students{
    constructor(
       public name:string,
       public age:number,
       public USN:string,
       public marks:number,
       public aadharNo ?:number,
       public panNo ?:string
    ){
    }
}
//object creation using literal way
let students1:Students={
    name:'hema',
    age:45,
    USN:'qwerty',
    marks:34
}
console.log(students1.USN);
console.log(students1.age);

let student3=new Students("rosh",34,"qwerty12",23,undefined,"234234");
console.log(student3.name);
console.log(student3.USN);

let clearedstudents=[
    new Students("hema",21,"hema",67)
];
console.log(clearedstudents)