package clgPracticals;

import java.util.Scanner;

class Pr3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); // creating object of Scanner
		int ans = 1, n;
		System.out.print("Enter number ");
		n = a.nextInt(); // Will assign numerical value to n
		a.close();

		// Main Logic
		for (int i = n; i > 0; i--) {
			ans = ans * i;
		}
		System.out.println("the factorial of " + n + " is " + ans);
	}
}
