package com.by.smit;

class TestOb {
	int a, b;

	TestOb(int i, int j) {
		a = i;
		b = j;
	}

	// returns true of o is equal to invoking object
	boolean equals(TestOb o) {
		if (o.a == a && o.b == b)
			return true;
		else
			return false;
	}
}

class PassOb {
	public static void main(String[] args) {
		TestOb ob1 = new TestOb(100, 22);
		TestOb ob2 = new TestOb(100, 22);
		TestOb ob3 = new TestOb(-1, -1);

		System.out.println("ob1 == ob2 " + ob1.equals(ob2));
		System.out.println("ob1 == ob3 " + ob1.equals(ob3));
	}
}
