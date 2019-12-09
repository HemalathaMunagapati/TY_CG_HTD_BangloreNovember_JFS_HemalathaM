package com.cpag.type.pack1;

public class Primitive {
	//impicit typecasting
	byte b=4;
	short s=b;
	int a=b;
	float f=b;
	double d=b;
	void values() {
		System.out.println("Byte value "+b);
		System.out.println( "short value "+b);
		System.out.println("int value "+b);
		System.out.println("float value "+b);
		System.out.println("double value "+b);


	}
	public static void main(String[] args) {
		Primitive p=new Primitive();
		p.values();
	}

}
