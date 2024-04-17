package com.by.smit;

class Box4 {
	double width;
	double height;
	double depth;

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo4 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		Box4 mybox2 = new Box4();
		double vol;
		// Assining values to Object 1
		mybox1.height = 20;
		mybox1.width = 10;
		mybox1.depth = 15;

		// Assining values to object 2
		mybox2.width = 3;
		mybox2.height = 5;
		mybox2.depth = 9;

		// Display the volume of box1
		vol = mybox1.volume();
		System.out.println("The Volume is: " + vol);
		// display the volume of box2
		vol = mybox2.volume();
		System.out.println("The volume is: " + vol);
	}
}
