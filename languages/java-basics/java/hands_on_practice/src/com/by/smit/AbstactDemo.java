package com.by.smit;

abstract class Abs {
	abstract void callme();

	// concrete methods are still allowed in abstract class
	void callmetoo() {
		System.out.println("This is concrete method");
	}
}

class Bis extends Abs {
	void callme() {
		System.out.println("Bis's implementation of callme");
	}
}

class AbstactDemo {
	public static void main(String[] args) {
		Bis call = new Bis();
		call.callme();
		call.callmetoo();
	}
}
