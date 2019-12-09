
public interface Bottle {
	void open();
	void drink();
   static void pure(){
		System.out.println("static interface method");
	}
   default void juice() {
	   System.out.println("helloo..im defauly method");
   }

}
