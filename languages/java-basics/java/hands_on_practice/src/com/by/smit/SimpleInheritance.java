package com.by.smit;

class A {
	int i, j;

	void showij() {
		System.out.println("i and j are:" + i + " " + j);
	}
}

class B extends A {
	int k;

	B(int n) {
		k = n;
	}

	void show() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i + j + k= " + (i + j + k));
	}
}

class SimpleInheritance {
	public static void main(String[] args) {
		A sup = new A();
		B sub = new B(30);
		sup.i = 1;
		sup.j = 2;
		sub.i = 10;
		sub.j = 20;
		sup.showij();
		sub.showij();
		sub.show();
		System.out.print("Sum Of: ");
		sub.sum();
	}
}
