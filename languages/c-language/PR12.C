#include<stdio.h>
#include<conio.h>

int main()
{
	int i=0,odd=0,even=0;
//	clrscr();

	while(i<=100){
	if(i%2==0){even=even+i;}
	else{odd=odd+i;}
	i++;
	}
	printf("Sum of odd numbers: %d",odd);
	printf("\nSum of even numbers: %d",even);
	getch();
	return 0;
}
