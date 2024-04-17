package com.by.smit;

class Test4 {
	int a; // default access
	public int b; // public access
	private int c; // private access

	// methods to access c
	void setc(int i) {
		c = i;
	}

	int getc() {
		return c;
	}
}

class AccessTest {
	public static void main(String args[]) {
		Test4 ob1 = new Test4();

		// These are ok, a and b may be accessed directly
		ob1.a = 10;
		ob1.b = 20;

		// This is not ok and will occur error
//		ob1.c=100;	//Error!

		// you must access c through its methods

		ob1.setc(40);

		System.out.println("a , b and c: " + ob1.a + " " + ob1.b + " " + ob1.getc());

	}
}
