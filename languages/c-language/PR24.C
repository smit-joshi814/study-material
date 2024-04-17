
#include <stdio.h>
#include <conio.h>

int main()
{
	int i, n, no, sum = 0, max, min, odd = 0, even = 0;
	float avg = 0;
//	clrscr();
	printf("how many numbers you want to enter ");
	scanf("%d", &n);
	for (i = 1; i <= n; i++)
	{
		printf("enter no: ");
		scanf("%d", &no);
		sum = sum + no;
		if (n % 2 == 0)
		{
			even = even + 1;
		}
		else
		{
			odd = odd + 1;
		}
		if (no < min)
		{
			min = no;
		}
		if (no > max)
		{
			no = max;
		}
		avg =(double)sum / n;
	}
	printf("\n\nsum=: %d\n", sum);
	printf("average=: %d\n", avg);
	printf("total odd=: %d\n", odd);
	printf("total  min=: %d\n", min);
	printf("maximum value is=: %d\n", max);
	getch();
	return 0;
}
