#include<stdio.h>
#include<conio.h>
int factorial(int no);
int main()
{
	int i,fact;
//	clrscr();
	printf("enter the number ");
	scanf("%d",&i);
	fact=factorial(i);
	printf("the factorial of %d is %d",i,fact);
	getch();
	return 0;
}
int factorial(int no)
{
	int ans=1;
	if(no==0)
	return 1;
	else
	ans=no*factorial(no-1);
	return ans;
}
