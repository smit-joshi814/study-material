package clgPracticals;

import java.util.Scanner;
class pr9 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=s1.nextLine();
		s1.close();
//		int x[]=new int[20];
		int[] a=new int[20];
		
		int len=s.length();
		int i,j,temp;
		
		for(i=0;i<len;i++) {
			a[i]=s.charAt(i);
		}
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Accending order String: ");
		for(i=0;i<len;i++)
			System.out.print((char)a[i]);
	}
}