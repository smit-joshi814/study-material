package clgPracticals;


class Pr2 {
	public static void main(String[] args) {
		try { // using try to handle ArrayIndexOutOfBoundsException
			double pi, r, ans;
			pi = 3.14;
			r = Integer.parseInt(args[0]);
			ans = pi * r * r;
			System.out.println("Area Of circle " + ans);
		} catch (ArrayIndexOutOfBoundsException e) { // this block will handle Exception
			System.out.println("Please give a command line argument before running");
		}
	}
}
