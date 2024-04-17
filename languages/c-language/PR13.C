#include<stdio.h>
#include<conio.h>

int main()
{
	int no=100,sum=0;
//	clrscr();
	while(no>=100&&no<=300)
	{
	if(no%3==0){sum=sum+no;}
	no++;
	}
	printf("no divided by 3 beatween 100 & 300 : %d",sum);
	getch();
	return 0;
}
