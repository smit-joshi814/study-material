#include<stdio.h>
#include<conio.h>

void main()
{
	float amount;
	int unit;
	clrscr();
	p:
	printf("\nENter Unit= ");
	scanf("%d",&unit);
	if(unit>=1&&unit<=100)
	{
	amount=unit*4;
	}
	else if(unit>=100&&unit<=200)
	{
	amount=unit*4.50;
	}
	else if(unit>=201&&unit<=400)
	{
	amount=unit*5;
	}
	else if(unit>=401)
	{
	amount=unit*6;
	}
	else
	{
	printf("please enter correct unit");
	goto p;
	}
	printf("\nElectrity bill: %2f",amount);
	getch();
	}