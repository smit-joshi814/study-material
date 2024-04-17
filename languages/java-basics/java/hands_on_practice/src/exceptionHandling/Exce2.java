package exceptionHandling;

class Exce2 {
	public static void main(String[] args) {
		int d, a;

		try { // monitor block of code
			d = 0;
			a = 43 / d;
			System.out.println("This will not be printed" + a);
		} catch (ArithmeticException e) { // catch devide by zero error
			System.out.println("Devision By Zero");
		}
		System.out.println("After Catch Statement");
	}
}
