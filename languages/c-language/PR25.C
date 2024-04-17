#include <stdio.h>
#include <conio.h>

int main()
{
	int marks[20], r[20], i;
//	clrscr();
	for (i = 1; i <= 10; i++)
	{
		printf("Enter %d student's Roll no & marks ", i);
		scanf("%d%d", &r[i], &marks[i]);
	}
	for (i = 1; i <= 10; i++)
	{
		printf("the %d students Roll No and marks are %d\t%d\n", i, r[i], marks[i]);
	}
	getch();
	return 0;
}
