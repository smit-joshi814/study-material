#include <stdio.h>
#include <conio.h>

int main()
{
	int j, a;
//	clrscr();
	for (j = 1; j <= 100; j++)
	{
		for (a = 1; a <= j; a++)
		{
			printf("*");
		}
		printf("\n");
	}
	getch();
	return 0;
}
