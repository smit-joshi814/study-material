#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c,x,n=1,i=1;
//	clrscr();
	printf("First five armstrong number: \n");
	d:
	a=n%10;
	b=(n/10)%10;
	c=n/100;
	x=a*a*a+b*b*b+c*c*c;
	if(x==n){printf("\t%d\n",n);i++;}
	n++;
	while(i<=5) goto d;
	getch();
	return 0;
}
