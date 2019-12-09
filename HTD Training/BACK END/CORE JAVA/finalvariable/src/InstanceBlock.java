
public class InstanceBlock {
	final int max;
	static final double PI;
	InstanceBlock()
	{
		System.out.println("constructor gets executed after IIB");
	}
	{
		System.out.println("IIB statements will be executed first");
		this.max=25000;
	}
	static {
		System.out.println("static block gets executed");
		PI=3.124;
	}
	public static void main(String[] args) {
		InstanceBlock ib=new InstanceBlock();
		System.out.println(ib.max );
		System.out.println(InstanceBlock.PI);
		
	}

}
