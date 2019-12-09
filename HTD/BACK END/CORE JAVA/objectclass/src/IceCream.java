
public class IceCream {
String name;
String address;

public IceCream(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	IceCream other = (IceCream) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public static void main(String[] args) {
	IceCream ic=new IceCream("Butterscotch","Banglore");
	IceCream ic1=new IceCream("Butterscotch","Banglore");
	System.out.println(ic.hashCode());
	System.out.println(ic1.hashCode());
	System.out.println(ic.equals(ic1));
	
}

}