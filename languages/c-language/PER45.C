#include<stdio.h>
//#include<conio.h>
#define MAX(x,y)(x)>(y)?(x):(y)
int main()
{
int x,y;
//clrscr();
printf("\nEnter the value of x,y: ");
scanf("%d%d",&x,&y);
printf("\nLargest value:%d",MAX(x,y));
//getch();
return 0;
}
