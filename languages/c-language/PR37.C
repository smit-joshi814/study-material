#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
	char *p,s[10];
	int i,t=0;
//	clrscr();
	printf("Enter string ");
	scanf("%s",s);
	p=s;
	t=strlen(p);
	for(i=0;i<t;i++)
	{
	printf("\nthe address of %c is %u",p[i],&p[i]);
	}
getch();
return 0;
}
