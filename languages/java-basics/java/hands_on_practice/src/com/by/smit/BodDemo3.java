package com.by.smit;

class Box3 {
	double height;
	double width;
	double depth;

	// display the volume of box
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}

class BoxDemo3 {
	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();

		// Assining values to Object 1
		mybox1.height = 20;
		mybox1.width = 10;
		mybox1.depth = 15;

		// Assining values to object 2
		mybox2.width = 3;
		mybox2.height = 5;
		mybox2.depth = 9;

		// Display the volume of box1
		mybox1.volume();

		// display the volume of box2
		mybox2.volume();
	}
}
