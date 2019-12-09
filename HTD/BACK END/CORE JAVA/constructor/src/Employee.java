public class Employee {
	String empName;
	int empAge;
	int empSalary;
	Employee(String name,int age,int salary)
	{
		this.empName=name;
		this.empAge=age;
		this.empSalary=salary;
	}
	void empDetails()
	{
		System.out.println("Name of the employee:"+empName+" and age:"+empAge+" with required salary:"+empSalary);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Hemalatha",22,22000);
	
		e1.empDetails();
	}
}
