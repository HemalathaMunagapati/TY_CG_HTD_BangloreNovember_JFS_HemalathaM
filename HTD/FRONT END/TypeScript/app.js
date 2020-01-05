"use strict";
// console.log("Welcome to typescript")
console.log("typescript code started");
var greeter = 123;
// var greeter=null;
// a="hema" @Error it cannot reassigned type number to string
console.log(greeter);
var counts;
//implicitly considered as any type
counts = 100;
counts = "hema";
counts = null;
console.log(counts);
//arrays
var marks = [1, 3, 5, 6];
var student;
student = {
    name: "hema",
    age: 123,
    pass: true
};
console.log(student);
console.log("typescript code ended");
//typescript classes
var Sample = /** @class */ (function () {
    function Sample() {
        //public acessspecifiers
        this.a = 100;
        this.name = "marks";
    }
    return Sample;
}());
var sample1 = new Sample();
console.log(sample1.a);
console.log(sample1.name);
var Student = /** @class */ (function () {
    //constructor
    function Student(name, age, USN, marks) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
    }
    Student.prototype.details = function () {
        console.log("name is " + this.name + ",\n        age is " + this.age + ",\n        usn is " + this.USN + ",\n        marks are " + this.marks + "\n        ");
    };
    return Student;
}());
var student1 = new Student('hema', 12, '531', 289);
console.log(student1.name);
console.log(student1.age);
console.log(student1.USN);
console.log(student1.marks);
student1.details();
