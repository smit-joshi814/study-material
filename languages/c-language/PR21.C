#include <stdio.h>
#include <conio.h>
int main()
{
	int i, j, a = 1, k = 1;
//	clrscr();
	for (i = 1; k <= 4; i++)
	{
		for (j = 1; j <= 1; j++)
		{
			printf(" ");
		}
		for (k = 1; k <= i; k++)
		{
			printf(" %d ", a);
			a++;
		}
		printf("\n");
	}
	getch();
	return 0;
}
