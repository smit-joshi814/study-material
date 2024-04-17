package com.by.smit;

class Outer1 {
	int outer_x = 100;

	void test() {
		for (int i = 1; i < 10; i++) {
			class Inner {
				void display() {
					System.out.println("display: outer_x= " + outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}

class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.test();
	}
}
