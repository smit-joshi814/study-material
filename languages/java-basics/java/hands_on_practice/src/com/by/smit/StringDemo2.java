package com.by.smit;

class StringDemo2 {
	public static void main(String[] args) {
		String strOb1 = "First String";
		String strOb2 = "Second String";
		String strOb3 = strOb1;

		System.out.println("Length of strOb1: " + strOb1.length());
		System.out.println("Char At index 3 in strOb2: " + strOb2.charAt(3));

		if (strOb1.equals(strOb2))
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");

		if (strOb1.equals(strOb3))
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");
	}
}
