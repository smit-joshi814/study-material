#include <stdio.h>
#include <conio.h>

int main()
{
	int a, i, n;
//	clrscr();
	printf("Enter the no: ");
	scanf("%d", &n);
	printf("reverse no is: ");
	for (i = 1; i <= 100; i++)
	{
		a = n % 10;
		printf("%d", a);
		n = n / 10;
		if (n <= 0)
			goto p;
	}
p:
	getch();
	return 0;
}
