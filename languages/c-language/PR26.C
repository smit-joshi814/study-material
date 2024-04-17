#include <stdio.h>
#include <conio.h>

int main()
{
	int i, j, a[3][3] = {10, 21, 32, 43, 54, 65, 76, 87, 98};
	int c[3][3], b[3][3] = {98, 87, 76, 65, 54, 43, 32, 21, 10};
//	clrscr();
	printf("First arry\n");
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
		{
			printf(" %d ", a[i][j]);
		}
		printf("\n");
	}
	printf("\n\nSecond arry\n");
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
		{
			printf(" %d ", b[i][j]);
		}
		printf("\n");
	}
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
		{
			c[i][j] = a[i][j] + b[i][j];
		}
	}
	printf("\n\nthe addition of given matrices: \n");
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
		{
			printf(" %d ", c[i][j]);
		}
		printf("\n");
	}
	getch();
	return 0;
}
