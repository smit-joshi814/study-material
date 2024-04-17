#include <stdio.h>
#include <conio.h>
int main()
{
	int i, j;
//	clrscr();
	for (i = 1; i <= 5; i++)
	{
		for (j = 1; j <= i; j++)
		{
			if (i == 4 && j == 3 || i == 4 && j == 2 || i==3 && j==2)
				printf("   ");
			else
				printf(" * ");
		}
		printf("\n");
	}
	getch();
	return 0;
}
