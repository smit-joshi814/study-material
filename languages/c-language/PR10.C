#include<stdio.h>
#include<conio.h>
int main()
{
	int r,no,sum=0;
//	clrscr();
	printf("Enter the value of no ");
	scanf("%d",&no);
	while(no>0)
	{
	r=no%10;
	sum=sum+r;
	no=no/10;
	}
	printf("Sum of digit: %d",sum);
	getch();
	return 0;
}
