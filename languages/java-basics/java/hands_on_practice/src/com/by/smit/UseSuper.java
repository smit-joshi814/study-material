package com.by.smit;

//using super to overcome name hiding
class Aa {
	int i;
}

//create a subclass by extending class Aa
class Bb extends Aa {
	int i;

	Bb(int a, int b) {
		super.i = a; // i in Aa
		i = b; // i in Bb
	}

	void show() {
		System.out.println("i in super class: " + super.i);
		System.out.println("i in sub class: " + i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		Bb obj = new Bb(10, 20);

		obj.show();
	}
}
