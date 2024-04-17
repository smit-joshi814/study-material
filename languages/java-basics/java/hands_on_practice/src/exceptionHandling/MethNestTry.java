package exceptionHandling;

class MethNestTry {
	static void nesttry(int a) {
		try { // nested try block
			if (a == 1)
				a = a / (a - a); // devide bu zero

			if (a == 2) {
				int c[] = { 1 };
				c[10] = 99; // out-of-bounds exception
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out-of-bounds " + e);
		}
	}

	public static void main(String args[]) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a: " + a + " " + b);

			nesttry(a);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}
	}
}