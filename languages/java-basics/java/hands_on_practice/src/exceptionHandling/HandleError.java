package exceptionHandling;

import java.util.Random;

class HandleError {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;

		Random r = new Random();

		for (int i = 0; i < 320; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				System.out.println("Exception: " + e); // displaing the Exception
				a = 0; // set to zero and continue
			}
			System.out.println("a: " + a);
		}
	}
}