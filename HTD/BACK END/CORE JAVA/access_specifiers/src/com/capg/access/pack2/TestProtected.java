package com.capg.access.pack2;

public class TestProtected {
	void test() {
		System.out.println("testing the protected acccess specifier");
	}
	public static void main(String[] args) {
		Protected p=new Protected("p.Protect");
		p.name="Myself";
		p.meth();
	}

}
