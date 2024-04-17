package com.by.smit;

class IfSample {
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 20;

		if (x < y)
			System.out.println("X is Less then Y");
		x = x * 2;
		if (x == y)
			System.out.println("X now Equal to Y");
		x = x * 2;
		if (x > y)
			System.out.println("X now Grater than Y");
		// this will not display anything
		if (x == y)
			System.out.println("You Won't see this");
	}
}
