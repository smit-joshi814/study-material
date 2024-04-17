#include <stdio.h>
#include <conio.h>

int main()
{
	int n = 0, i = 1, j = 1, ct = 0;
//	clrscr();
	while (n <= 5)
	{
		j = 2;
		ct = 0;
		while (i > j)
		{
			if (i % j == 0)
				ct++;
			j++;
		}
		if (ct == 0)
		{
			printf(" %d ", i);
			n++;
		}
		i++;
	}
	getch();
	return 0;
}
