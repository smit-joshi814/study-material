package clgPracticals;

class pr7 {
	public static void main(String[] args) {
		try {
		String s=args[0];
		String s1=args[1];
		
		System.out.println("First value "+s);
		System.out.println("Second Value "+s1);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Enter Command line Arguments");
		}
	}
}
