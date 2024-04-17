#include<stdio.h>
#include<conio.h>
int prime(int);

int main()
{
	int x,no;
//	clrscr();
	printf("Enter no: ");
	scanf("%d",&no);
	x=prime(no);
	printf("\t%d",x);
	getch();
	return 0;
}
int prime (int y)
{
	int i;
	for(i=2;i<=y;i++)
	{
		if(y%i==0)
		{
		return(0);
		}
		else
		{
		return(1);
		}
	}
	return 0;
}
