package com.by.smit;

class OvercallA {
	void callme() {
		System.out.println("Inside A's Callme Methoad");
	}
}

class OvercallB extends OvercallA {
	void callme() {
		System.out.println("Insede B's callme Methoad");
	}
}

class OvercallC extends OvercallB {
	void callme() {
		System.out.println("Inside c's callme Methoad");
	}
}

class Dispatch {
	public static void main(String[] args) {
		OvercallA a = new OvercallA();
		OvercallB b = new OvercallB();
		OvercallC c = new OvercallC();

		OvercallA ref; // obtain a reference of type OvercallA
		ref = a; // reference to an object
		ref.callme(); // call OvercallA's version of callme

		ref = b; // reference to an object
		ref.callme(); // call OvercallB's version of callme

		ref = c; // reference to an object
		ref.callme(); // call OvercallC's version of callme

	}
}