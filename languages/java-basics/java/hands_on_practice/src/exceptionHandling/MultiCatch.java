package exceptionHandling;

class MultiCatch {
	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
			System.out.println("a: " + a + " " + b);
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Oob: " + e);
		}
		System.out.println("After try/catch Blocks");
	}
}