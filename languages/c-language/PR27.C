#include <stdio.h>
#include <conio.h>
#include <string.h>

int main()
{
	int i, j, l, n;
	char a[100], b[100], t;
//	clrscr();
	printf("Enter a string");
	scanf("%s", a);
	// gets(a);
	n = strlen(a);
	for (i = 0; j < n; j++)
	{
		for (j = 0; j < n; j++)
		{
			if (a[i] <= a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	}
	printf("the string in ascending order is ");
	printf("%s", a);
	// puts(a);
	printf("\nhow many no you want ");
	scanf("%d", &n);
	printf("\nEnter a line of %d word\n", n);
	for (i = 0; i < n; i++)
	{
		scanf("%s", b);
		l = strlen(b);
		t = '2';
		for (j = 0; j < l; j++)
			;
		{
			if (b[j] < t)
				t = b[j];
		}
	}
	printf("\nthe smalest character of %s is '%c'", b, t);
	getch();
	return 0;
}
