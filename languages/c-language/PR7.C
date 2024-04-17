#include<stdio.h>
#include<conio.h>
int main()
{

	int number;
//	clrscr();
	printf("Enter the number ");
	scanf("%d",&number);

	switch(number)
	{
		case 1:{printf("sunday");break;}
		case 2:{printf("monday");break;}
		case 3:{printf("Twesday");break;}
		case 4:{printf("wenesday");break;}
		case 5:{printf("Thursday");break;}
		case 6:{printf("Friday");break;}
		case 7:{printf("saturday");break;}
		default:{printf("wrong number inserted");}
	}
	getch();
	return 0;
}
