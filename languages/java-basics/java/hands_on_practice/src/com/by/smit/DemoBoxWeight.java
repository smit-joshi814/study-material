package com.by.smit;

class Box9 {
	private double width;
	private double height;
	private double depth;

	// when nothing spacified
	Box9() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// when all parameters spacified
	Box9(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// when object is passed
	Box9(Box9 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// when cube is created
	Box9(double len) {
		width = height = depth = len;
	}

	// calculate the volume
	double volume() {
		return width * height * depth;
	}

}

class BoxWeight extends Box9 {
	double weight; // weight of box

	BoxWeight(BoxWeight ob) {
		weight = ob.weight;
	}

	BoxWeight(double w, double h, double d, double m) {
//		width=w;
//		height=h;
//		depth=d;
		super(w, h, d);
		weight = m;
	}

	// Default constructor
	BoxWeight() {
		super();
		weight = -1;
	}

	// constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

//Add shiping costs
class Shipment extends BoxWeight {
	double cost;

	// construct clone of an object
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}

	// constructor when all perameters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m); // call super class constructor
		cost = c;
	}

	// default constructor
	Shipment() {
		super();
		cost = -1;
	}

	// constructor used when cube is created
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}

class DemoBoxWeight { // shipment added
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment();
		Shipment shipment2 = new Shipment(10, 5, 400);
		Shipment shipment3 = new Shipment(10, 20, 30, 60, 1000);
		double vol;

		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is: " + vol);
		System.out.println("Weight of shipment1 is: " + shipment1.weight);
		System.out.println("Cost of shipping1 is: $" + shipment1.cost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is: " + vol);
		System.out.println("Weight of shipment2 is: " + shipment2.weight);
		System.out.println("Cost of Shipping2 is: $" + shipment2.cost);
		System.out.println();

		vol = shipment3.volume();
		System.out.println("Volume of shipment3 is: " + vol);
		System.out.println("Weight of shipment3 is: " + shipment3.weight);
		System.out.println("Cost of shipping3 is: $" + shipment3.cost);
		System.out.println();
	}
}