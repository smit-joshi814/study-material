#include<stdio.h>
#include<conio.h>

int main()
{
	int i=0,sum=0;
//	clrscr();
	do{
	sum=sum+i;
	i++;
	}while(i<=100);
	printf("Sum of first 100 nactural numbers : %d",sum);
	getch();
	return 0;
}
