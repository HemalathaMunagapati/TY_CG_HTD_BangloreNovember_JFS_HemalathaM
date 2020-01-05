"use strict";
var Students = /** @class */ (function () {
    function Students(name, age, USN, marks, aadharNo, panNo) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }
    return Students;
}());
//object creation using literal way
var students1 = {
    name: 'hema',
    age: 45,
    USN: 'qwerty',
    marks: 34
};
console.log(students1.USN);
console.log(students1.age);
var student3 = new Students("rosh", 34, "qwerty12", 23, undefined, "234234");
console.log(student3.name);
console.log(student3.USN);
var clearedstudents = [
    new Students("hema", 21, "hema", 67)
];
console.log(clearedstudents);
