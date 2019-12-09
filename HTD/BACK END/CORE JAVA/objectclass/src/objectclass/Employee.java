package objectclass;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
   public boolean equals(Object obj)
   {
	   Employee e1=(Employee)obj;
	   if(e1.empId==(this.empId))
	   {
		   if(e1.empName.equals(this.empName))
		   {
			   return true;
		   }
		   else
			   return false;
	   }
	   return false;
   }
	public static void main(String[] args) {
		Employee em=new Employee(32,"Hema");
		Employee em2=new Employee(31,"hemalatha");
		System.out.println(em.toString());
		System.out.println(em.hashCode());
		System.out.println(em2.hashCode());
		System.out.println(em2);
		Object o1=new Object();
		System.out.println(o1.hashCode());
		System.out.println(o1);
		System.out.println(em.equals(em2));
		
		
	}

}

