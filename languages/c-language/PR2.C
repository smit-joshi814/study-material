#include<stdio.h>
#include<conio.h>
int main()
{
	int x;
	float area,volume;
//	clrscr();
	printf("Enter the value of r= ");
	scanf("%d",&x);
	area=4*3.14*x*x;
	printf("Area of the spare = %f\n",area);
	volume=(4/3.0)*3.14*x*x*x;
	printf("Volume of the sphere= %f\n",volume);
	getch();
	return 0;
}
