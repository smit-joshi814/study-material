#include<stdio.h>
#include<conio.h>
int main()
{
	int a;
//	clrscr();
	printf("Enter number ");
	scanf("%d",&a);
	if(a<0){printf("\nNumber %d is Negative",a);}
	else if(a==0){printf("Number %d is zero",a);}
	else{printf("Number %d is positive",a);}
	getch();
	return 0;
}
