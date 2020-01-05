//in js array is a heterogeneous data which leads a drawback
var technologies=['java','spring','jdbc','hibenate','servlets','html','css','bootstrap',123,true];
console.log(technologies[0]);
//prints all the elements in an array
//for of used for only arrays
for(let technology of technologies){
    console.log(technology);                
}
//prints the indexes in an array
//for in used fro both objects and arrays
for(let technology in technologies){

    console.log("index is"+technology +"value is:"+technologies[technology])
}

technologies.forEach((value,index)=>{
console.log("value at index"+index)
console.log("value:"+value )
})
//indexOf returns the first occuring index of an value
console.log(technologies.indexOf("java"))
//return type of pop() is value in the last index of an array
console.log(technologies.pop())
console.log('before pushing the element ')
console.log(technologies.push('angular','spring boot'));
for(let technology in technologies){

    console.log("index is"+technology +"value is:"+technologies[technology])
}
console.log(technologies.shift())
for(let technology in technologies){

    console.log("index is"+technology +"value is:"+technologies[technology])
}
console.log(technologies.unshift('java'));
for(let technology in technologies){

    console.log("index is"+technology +"value is:"+technologies[technology])
}
//splice() used to add and remove the data in an array
technologies.splice(2,0,'bootstrap','reactjs');
console.log(technologies)

technologies.splice(2,2,'css');
console.log(technologies)

technologies.splice(technologies.indexOf('servlets'),2);
console.log(technologies)

console.log(technologies.length)
technologies.reverse();
console.log(technologies )
//filter()
var marks=[54,55,5,14,54,74,18]
let filteredarray=marks.filter((value,index,array)=>{
    return value>40;
});
console.log(filteredarray)
console.log(filteredarray.length)

var marks1=[21,21,32,23,32,12,12,33]
let filteredarray1=marks1.filter((value,index,array)=>{
   return marks1.indexOf(value)==index;
});
console.log(filteredarray1);
console.log(filteredarray1.length)

var x=[20,30,40,50,60]
//map() creates a new array with the value which will be write in the return statements
let newArray=x.map((value,index,array)=>{
    return {index1:index,value1:value};
});
console.log(newArray);

let array=[12,23,34,45,53,54,63,67,78,90]
let sortedarray=array.sort((a,b)=>{
    return a-b;
});
console.log(sortedarray);
let sorting=array.sort((a,b)=>{
    return b-a;
});
console.log(sorting)
