package clgPracticals;

public class Pr5 {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum, i;

		for (i = 0; i <= 25; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}
	}
}