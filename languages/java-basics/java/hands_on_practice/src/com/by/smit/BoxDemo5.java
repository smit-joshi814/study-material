package com.by.smit;

class Box5 {
	double height;
	double width;
	double depth;

	double volume() {
		return width * height * depth;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo5 {
	public static void main(String[] args) {
		Box5 mybox1 = new Box5();
		Box5 mybox2 = new Box5();
		double vol;

		// Passing value for MyBox1
		mybox1.setDim(10.5, 20.9, 30.2);
		vol = mybox1.volume(); // Storing ans
		System.out.println("The volume of Box1 is: " + vol);

		// Passing value for MyBox2
		mybox2.setDim(20.5, 56.5, 90.2);
		vol = mybox2.volume();
		System.out.println("The volume of box2 is: " + vol);
	}
}
