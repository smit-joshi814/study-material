package com.by.smit;

class BoxOverload {
	double width;
	double height;
	double depth;

	// No dimensions specified
	BoxOverload() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// all dimensions apecified
	BoxOverload(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// when cube is created
	BoxOverload(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons {
	public static void main(String[] args) {
		BoxOverload mybox = new BoxOverload();
		BoxOverload mybox1 = new BoxOverload(7);
		BoxOverload mybox2 = new BoxOverload(10, 20, 15);

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

	}
}
