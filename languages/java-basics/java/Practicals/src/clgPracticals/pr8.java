package clgPracticals;

import java.util.Scanner;
class pr8 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=s1.nextLine();
		s1.close();
		int x[]=new int[20];
		int[] a=new int[20];
		
		int len=s.length();
		int i,j;
		boolean flag=false;
		
		for(i=0;i<len;i++) {
			a[i]=s.charAt(i);
		}
		
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
					if(a[i]==a[j]) {
						x[i]+=1;
					}
			}
		}
		for(i=0;i<len;i++) {
			for(j=0;j<i;j++) {
				if(a[j]==s.charAt(i)) flag=true;
			}
			if(!flag) {
				System.out.println("the "+(char)a[i]+" occurs "+x[j]);
			}
			flag=false;
		}
	}
}