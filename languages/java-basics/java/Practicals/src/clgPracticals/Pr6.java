package clgPracticals;

public class Pr6 {
	public static void main(String[] args) {
		//this will display Triangle of Numbers
		System.out.println("\nDisplaying Number Triangle");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//this will Display Triangle of stars
		System.out.println("\nDisplaying star Triangle");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
