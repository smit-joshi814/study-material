#include<stdio.h>
#include<conio.h>
#include<math.h>

int main()
{
	int x=1,i,j;
	long int sum=0;
//	clrscr();
	printf("Enter the value of x= ");
	scanf("%d",&x);
	printf("Enter the value of i= ");
	scanf("%d",&i);
	for(j=1;j<=i;j++)
	{
	sum=sum+pow(x,j);
	}
	printf("answer= %d",sum);
	getch();
	return 0;
}
