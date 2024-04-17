package com.by.smit;

class Scope {
	public static void main(String[] args) {
		int x = 10;
		if (x == 10) { // starts a new scope
			int y = 20; // known only to this block

			// x and y both known here
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y=100; //error y not known here

		// x still known here
		System.out.println("x is " + x);
	}
}
