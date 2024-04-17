package com.by.smit;

class Box1 {
	double height;
	double width;
	double depth;
}

class BoxDemo2 {
	public static void main(String[] args) {
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();

		double vol;

		// Assining values to Object 1
		mybox1.height = 20;
		mybox1.width = 10;
		mybox1.depth = 15;

		// Assining values to object 2
		mybox2.width = 3;
		mybox2.height = 5;
		mybox2.depth = 9;

		// Computing volume of first box
		vol = mybox1.depth * mybox1.height * mybox1.width;

		System.out.println("Volume of Box1 is: " + vol);

		// Computing volume of second box
		vol = mybox2.depth * mybox2.height * mybox2.width;

		System.out.println("Volume of Box2 is: " + vol);
	}
}
