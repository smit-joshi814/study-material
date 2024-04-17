package com.by.smit;

class Test2 {
	int a, b;

	Test2(int i, int j) {
		a = i;
		b = j;
	}

	// passing an object
	void meth(Test2 ob) {
		ob.a *= 2;
		ob.b /= 2;
	}
}

class CallByRef {
	public static void main(String[] args) {
		Test2 obj = new Test2(15, 20);

		System.out.println("a and b before call: " + obj.a + " " + obj.b);

		// calling
		obj.meth(obj);

		// after calling
		System.out.println("a and b after call: " + obj.a + " " + obj.b);
	}
}
