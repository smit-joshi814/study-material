package com.by.smit;

class Factorial {
	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		System.out.println("n is: " + n + "\nresult is: " + result);
		return result;
	}
}

class Recursion {
	public static void main(String[] args) {
		Factorial find = new Factorial();

		System.out.println("Factorial of 3 is: " + find.fact(3));
		System.out.println("Factorial of 5 is: " + find.fact(5));
	}
}
