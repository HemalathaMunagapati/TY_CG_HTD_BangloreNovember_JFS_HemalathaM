interface Trainee extends Students{
    name:string,
    sub:string
}

class Training implements Trainee{
    name="keeeru";
    sub="science";
    printDetails(){
        console.log("hey..hii keeru")
    }
    age:23;
    USN="43";
    marks=234;
}
