var person={
    aadharno:908089
}
var pan={
    panno:123123
}

//Inheriting the data,multiple inheritence also possible
var student = {
    ...person,
    ...pan,
    id:1234,
    name:"hema",
    degree:'b.tech',
    phone:798989989,
    //nested object data
    address:{
        city:'nellore',
        state:'andhra',
        pincode:524305
    }
}

console.log(student);
console.log(student.name);
// console.log(student['degree'])