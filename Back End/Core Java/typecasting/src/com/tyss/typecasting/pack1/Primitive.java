package com.tyss.typecasting.pack1;

public class Primitive {

	// implicit typecasting
	byte a = 4;
	short b = a;
	int e = a;
	float c = a;
	double d = a;

	void value() {
		System.out.println("byte value is " + a);
		System.out.println("short value is " + b);
		System.out.println("int value is " + e);
		System.out.println("float value is " + c);
		System.out.println("double value is " + d);
	}

	// explicit typecasting
	double pi = 3.142;
	int i = (int) pi;

	void details() {
		System.out.println("double value is " + pi);
		System.out.println("int value is " + i);
	}

}
