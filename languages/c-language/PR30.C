#include<stdio.h>
#include<conio.h>

void exchange(int a,int b);
int main()
{
int x,y;
//clrscr();
printf("Enter x and y");
scanf("%d%d",&x,&y);
exchange(x,y);
getch();
return 0;
}
void exchange(int a, int b)
{
	int t;
	t=a;
	a=b;
	b=t;
	printf("\n the value of x & y is %d %d",a,b);
}
