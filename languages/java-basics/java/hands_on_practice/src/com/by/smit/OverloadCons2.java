package com.by.smit;

class BoxOverload1 {
	double width;
	double height;
	double depth;

	BoxOverload1(BoxOverload1 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// No dimensions specified
	BoxOverload1() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// all dimensions apecified
	BoxOverload1(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// when cube is created
	BoxOverload1(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons2 {
	public static void main(String[] args) {
		BoxOverload1 mybox = new BoxOverload1();
		BoxOverload1 mybox1 = new BoxOverload1(7);
		BoxOverload1 mybox2 = new BoxOverload1(10, 20, 15);

		BoxOverload1 myclone = new BoxOverload1(mybox1);
		double vol;

		// Volume of mybox
		vol = mybox.volume();
		System.out.println("Mybox: " + vol);

		// volume of mybox1
		vol = mybox1.volume();
		System.out.println("Mybox1: " + vol);

		// volume of mybox2
		vol = mybox2.volume();
		System.out.println("Mybox2: " + vol);

		// volume of clone
		vol = myclone.volume();
		System.out.println("Volume Of Myclone: " + vol);
	}
}
