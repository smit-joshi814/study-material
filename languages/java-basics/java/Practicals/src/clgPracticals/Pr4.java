package clgPracticals;

import java.util.Scanner;

class Pr4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // creating object
		int n;
		double ans = 0;
		System.out.print("\nEnter n ");
		n = s.nextInt(); // will Assign numarical value to n
		s.close();

		// main logic
		for (int i = 1; i <= n; i++) {
			ans += 1 / (double) i;
		}
		System.out.println("the answer of series is " + ans);
	}
}
