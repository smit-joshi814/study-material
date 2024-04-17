package com.by.smit;

import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		System.out.print("Enter any number ");
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		s.close();
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = height - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
