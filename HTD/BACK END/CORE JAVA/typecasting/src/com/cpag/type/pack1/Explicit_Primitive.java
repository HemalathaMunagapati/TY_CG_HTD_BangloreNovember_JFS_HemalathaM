package com.cpag.type.pack1;

public class Explicit_Primitive {
	double pi=9.99;
	int i=(int)pi;
	short s=(short)pi;
	byte b=(byte)pi;
	float f=(float)pi;
	void values() {
		System.out.println("double value "+pi);
		System.out.println("int value "+i);
		System.out.println("short value "+s);
		System.out.println("byte value "+b);
		System.out.println("float value "+f);
	}
	public static void main(String[] args) {
		Explicit_Primitive ep=new Explicit_Primitive();
		ep.values();
	}

}
