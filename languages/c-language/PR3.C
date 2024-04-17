#include<stdio.h>
#include<conio.h>

void main()
{
	int a,b,temp;
	clrscr();
	printf("Enter the value of A & B = ");
	scanf("%d%d",&a,&b);
	printf("\nA= %d\nB=%d",a,b);
	temp=a;
	a=b;
	b=temp;
	printf("\nAfter interchanging the valkue of numbers\nA=%d\nB=%d",a,b);
	getch();
}