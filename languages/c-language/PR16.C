#include<stdio.h>
#include<conio.h>

int main()
{
	int n=1,fact=1;
//	clrscr();
	printf("Enter the number: ");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	printf("factorial of %d is %d\n",n,fact);
	getch();
	return 0;
}
