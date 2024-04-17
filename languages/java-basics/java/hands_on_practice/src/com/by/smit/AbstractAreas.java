package com.by.smit;

abstract class Figure1 {
	double dim1;
	double dim2;

	Figure1(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class Rectangle1 extends Figure1 {
	Rectangle1(double a, double b) {
		super(a, b);
	}

	// override are for rectangle
	double area() {
		System.out.println("Area for Rectangle");
		return dim1 * dim2;
	}
}

class Triangle1 extends Figure1 {
	Triangle1(double a, double b) {
		super(a, b);
	}

	// override area for right triangle
	double area() {
		System.out.println("Area for triangle");
		return dim1 * dim2 / 2;
	}
}

class AbstractAreas {
	public static void main(String[] args) {
//		Figure f=new Figure(10,10);		//illigal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);

		Figure figuref;
		figuref = r;
		System.out.println("Area is: " + figuref.area());

		figuref = t;
		System.out.println("Area is: " + figuref.area());

//		figuref=f;
//		System.out.println("Area is: "+figuref.area());
	}
}
