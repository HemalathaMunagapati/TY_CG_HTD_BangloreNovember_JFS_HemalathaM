public class TestQspiders {
	public static void main(String[] args) {
		Qspiders BTM=new Qspiders();
		BTM.swipe();
		BTM.swipe();
		Qspiders BTR=new Qspiders();
		BTR.swipe();
		System.out.println(BTM.branchStudCount);
		System.out.println(BTR.branchStudCount);
		System.out.println(Qspiders.totalStudCount);
	}

}
