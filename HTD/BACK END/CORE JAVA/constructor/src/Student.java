public class Student {
	String stdName;
	int rollNo;
	Student(){
		
	}
	Student(String name,int rn){
		this.stdName=name;
		this.rollNo=rn;
		
	}
	public static void main(String[] args) {
		Student st1=new Student();
		System.out.println(st1.stdName);
		System.out.println(st1.rollNo);
        Student st2=new Student("Hema",531);
        System.out.println(st2.stdName);
        System.out.println(st2.rollNo);
	}

}
