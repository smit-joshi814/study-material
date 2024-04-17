#include <stdio.h>
#include <conio.h>

int main()
{
	int n, j;
	float sum = 0.0f;
//	clrscr();
	printf("Enter the value of n: ");
	scanf("%d", &n);
	for (j = 1; j <= n; j++)
	{
		sum = sum + 1 / (float)j;
	}
	printf("Answer %lf", sum);
	getch();
	return 0;
}
