// console.log("Welcome to typescript")
console.log("typescript code started");

var greeter = 123;  
// var greeter=null;
// a="hema" @Error it cannot reassigned type number to string
console.log(greeter);
let counts;
//implicitly considered as any type
counts=100;
counts="hema";
counts=null;
console.log(counts);

//arrays
let marks:number[]=[1,3,5,6];
let student:{name:string,age:number,pass:boolean};
student={
name:"hema",
age:123,
pass:true
}
console.log(student);
console.log("typescript code ended");

//typescript classes
class Sample{
    //public acessspecifiers
    a=100;
    name="marks";
}
let sample1=new Sample();
console.log(sample1.a);
console.log(sample1.name);

class Student{
    //constructor
    constructor(
        public name:string,
       public age:number,
        public USN:string,
       public marks:number ){

    }

    details():void{
        console.log(`name is ${this.name},
        age is ${this.age},
        usn is ${this.USN},
        marks are ${this.marks}
        `);
    }
}
let student1=new Student('hema',12,'531',289);
console.log(student1.name);
console.log(student1.age);
console.log(student1.USN);
console.log(student1.marks);
student1.details();