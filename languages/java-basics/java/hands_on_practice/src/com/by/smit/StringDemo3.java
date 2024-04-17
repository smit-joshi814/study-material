package com.by.smit;

class StringDemo3 {
	public static void main(String[] args) {
		String str[] = { "one", "two", "three" };

		// Displaying using for each

		/*
		 * for(String y:str) { System.out.println(y); }
		 */

		// another way
		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] " + str[i]);
		}
	}
}
