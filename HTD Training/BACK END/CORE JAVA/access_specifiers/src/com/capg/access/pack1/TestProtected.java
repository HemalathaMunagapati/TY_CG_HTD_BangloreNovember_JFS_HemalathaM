package com.capg.access.pack1;
import com.capg.access.pack2.Protected;
public class TestProtected extends Protected {

	protected TestProtected(String n) {
		super(n);
		
	}
	public static void main(String[] args) {
		TestProtected tp=new TestProtected("Me");
		tp.meth();
		tp.name="hema";
		
	
	}

}
