#include<stdio.h>
#include<conio.h>
int main()
{
	int x,i;
	long int a=0,b=1,c;
//	clrscr();
	printf("enter the range of fibonacci series: ");
	scanf("%d",&i);
//	printf("%ld %ld\n",a,b);
//	Correct Till 45 Fibbonacci numbers
	for(x=1;x<=i;x++)
	{
	c=a+b;
	a=b;
	b=c;
	printf(" %ld ",c);
	}
	getch();
	return 0;
}
