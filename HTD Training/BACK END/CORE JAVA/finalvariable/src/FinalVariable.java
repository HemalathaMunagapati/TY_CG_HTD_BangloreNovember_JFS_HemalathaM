public class FinalVariable {
	final double PI;
	FinalVariable(double PI)
	{
		this.PI=PI;
	}
	FinalVariable(int a,double PI){
		this.PI=PI;
	}
	void test() {
		System.out.println(PI);
	}
	public static void main(String[] args) {
		FinalVariable fv=new FinalVariable(3.14);
		fv.test();
		FinalVariable fv1=new FinalVariable(4,3.14);
		fv1.test();
	}
	

}
