
public class GoogleMap {
	void findlocation(String loc) {
		try {
			System.out.println(loc.length());
		}catch(NullPointerException np) {
			System.out.println("please enter the location details");
			throw np;
		}
	}
	

}
 