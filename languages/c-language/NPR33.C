#include<stdio.h>
#include<conio.h>

void fibonacci();
main()
{
	clrscr();
	printf("series of fibonacci\n");
	fibonacci();
	getch();
	return 0;
}
void fibonacci(){
	long int i,c=0,a=0,b=1;
	for(i=1;i<=25;i++)
	{
	c=a+b;
	printf("\t%ld",c);
	a=b;
	b=c;
	}
}
