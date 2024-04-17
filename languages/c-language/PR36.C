#include<stdio.h>
#include<conio.h>
int main()
{
int *p,n;
//clrscr();
printf("Enter the value of n ");
scanf("%d",&n);
p=&n;
printf("the address of %d id %u\n",n,p);
getch();
return 0;
}
