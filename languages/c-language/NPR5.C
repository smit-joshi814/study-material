#include<stdio.h>
#include<conio.h>

void main()
{
	int n1,n2,ans;
	clrscr();
	printf("Enter Two numbers");
	scanf("%d%d",&n1,&n2);
	ans=n1+n2;
	printf("\nSummation of Two numbers is %d",ans);
	ans=n1-n2;
	printf("\nsubsctraction of two numbers is %d",ans);
	ans=n1*n2;
	printf("\nMultiplicaction of two numbers is %d",ans);
	ans=n1/n2;
	printf("\ndivision of two numbers is% d",ans);

	getch();
}

