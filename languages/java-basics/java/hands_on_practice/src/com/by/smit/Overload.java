package com.by.smit;

class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// overloaded for integer perameter
	void test(int i) {
		System.out.println("i: " + i);
	}

	// overloading for two int perameter
	void test(int a, int b) {
		System.out.println("a and b:" + a + " " + b);
	}

	// overloading for double perameter
	double test(double a) {
		System.out.println("Double a: " + a);
		return a * a;
	}
}

class Overload {
	public static void main(String[] args) {
		OverloadDemo obj1 = new OverloadDemo();
		double result;

		// calling all
		obj1.test();
		obj1.test(10);
		obj1.test(10, 20);
		result = obj1.test(10.5);

		System.out.println("Result: " + result);
	}
}
