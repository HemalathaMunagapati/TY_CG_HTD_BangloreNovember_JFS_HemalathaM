
public class Ola {
GoogleMap g1;
Ola(GoogleMap g1){
	this.g1=g1;
}
void find(String a) {
	try {
		g1.findlocation(a);
	}catch(NullPointerException e) {
		System.out.println("ola users should enter the valid location");
	}
}
}
