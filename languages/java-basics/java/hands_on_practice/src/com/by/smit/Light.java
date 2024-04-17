package com.by.smit;

class Light {
	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;

		// approx speed of light in miles per second
		lightspeed = 186000;

		days = 100; // specify the no of days here

		seconds = days * 24 * 60 * 60; // convert to seconds

		distance = lightspeed * seconds; // compute diatance

		System.out.print("In " + days);
		System.out.print(" Days light will Travel about ");
		System.out.println(distance + " miles.");
	}
}
