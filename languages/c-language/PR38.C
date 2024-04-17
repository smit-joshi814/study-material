#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b,t,*p1,*p2;
//	clrscr();
	printf("Enter the two values ");
	scanf("%d%d",&a,&b);
	p1=&a;
	p2=&b;
	t=*p1;
	*p1=*p2;
	*p2=t;
	printf("Swapped values are %d\t%d",*p1,*p2);
	getch();
	return 0;
}
