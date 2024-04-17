package com.by.smit;

class Box6 {
	double width;
	double height;
	double depth;

	// This is Constructor
	Box6() {
		System.out.println("Constructing The Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo6 {
	public static void main(String[] args) {
		Box6 mybox1 = new Box6();
		Box6 mybox2 = new Box6();
		double vol;

		vol = mybox1.volume(); // Storing ans
		System.out.println("The volume of Box1 is: " + vol);

		vol = mybox2.volume();
		System.out.println("The volume of box2 is: " + vol);
	}
}