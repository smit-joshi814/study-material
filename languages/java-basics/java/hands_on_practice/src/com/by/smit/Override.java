package com.by.smit;

//Methoad Overriding.
class One {
	int i, j;

	One(int a, int b) {
		i = a;
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Two extends One {
	int k;

	Two(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// display k -this overrides show() in One
	void show() {
		super.show();
		System.out.println("k: " + k);
	}
}

class Override {
	public static void main(String[] args) {
		Two obj = new Two(10, 20, 30);

		obj.show(); // Call show() in Two

	}
}
