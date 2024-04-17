package com.by.smit;

class Box7 {
	double width;
	double height;
	double depth;

	Box7(double d, double h, double w) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo7 {
	public static void main(String[] args) {
		Box7 mybox1 = new Box7(10.5, 23, 1.45);
		Box7 mybox2 = new Box7(2.3, 4.5, 7.6);
		double vol;

		vol = mybox1.volume(); // Storing ans
		System.out.println("The volume of Box1 is: " + vol);

		vol = mybox2.volume();
		System.out.println("The volume of box2 is: " + vol);
	}
}