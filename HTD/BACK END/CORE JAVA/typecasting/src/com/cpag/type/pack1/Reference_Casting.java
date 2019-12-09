package com.cpag.type.pack1;

public class Reference_Casting {
	void cast() {
		System.out.println("used for type casting");
	}

}
class UpCasting extends Reference_Casting{
	void upCast() {
		System.out.println("It will assign its reference to sub class");
	}
}
class DownCasting extends Reference_Casting{
	void downCast() {
		System.out.println("It will assign its reference back to is original sub class");
	}
}
