package com.by.smit;

class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// this is inner class
	class Inner {
		int y = 10; // y is local to inner

		void display() {
			System.out.println("display: outer_x= " + outer_x);
		}
	}

	void showy() {
//		System.out.println(y);	//err, y not known here
		System.out.println("y is not in the scope of showy");
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}
