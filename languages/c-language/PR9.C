#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c;
//	clrscr();
	printf("Enter three numbers ");
	scanf("%d%d%d",&a,&b,&c);
	printf("\n");
	if(a>b&&c){printf("A is largest");}
	else if(b>c&&a){printf("B is largest");}
	else if(a==b && a==c && b==c){ printf("Numbers Are Equal");	}
	else{printf("C is largest");}
	getch();
	return 0;
}
