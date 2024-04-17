package exceptionHandling;

class SuperSubCatch {
	public static void main(String[] agrs) {
		try {
			int a = 0, b;
			b = 42 / a;
			System.out.println("a and b: " + a + " " + b);
		} catch (Exception e) {
			System.out.println("Generic Exception catch " + e);
		}
		// this will cause compile time error (Reverse the order of catch )
//		catch(ArithmeticException e) {
//			System.out.println("This is never Reatched");
//		}
	}
}
