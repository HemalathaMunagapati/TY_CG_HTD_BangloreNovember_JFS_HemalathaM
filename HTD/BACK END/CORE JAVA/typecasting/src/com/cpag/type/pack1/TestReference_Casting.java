package com.cpag.type.pack1;

public class TestReference_Casting {
	public static void main(String[] args) {
		Reference_Casting rc=new Reference_Casting();
		rc.cast();
		Reference_Casting rc1=new UpCasting();
		rc1.cast();
		UpCasting up=(UpCasting)rc1;
		up.upCast();
		up.cast();
		Reference_Casting rc2=new DownCasting();
		DownCasting dp=(DownCasting)rc2;
		dp.downCast();
		dp.cast();
		
	}

}
