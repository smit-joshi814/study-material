#include<stdio.h>
#include<conio.h>
main()
{
	struct personal{
	char name[20];
	int date,salary;
	}per[5];
	int i;
//	clrscr();
	for(i=1;i<=2;i++)
	{
	printf("enter\tname\tdate  of joining salaryof employ %d\n",i);
	scanf("%s%d%d",&per[i].name,&per[i].date,&per[i].salary);
	}
	printf("\nname\tDate of joining\tsalary\n");
	for(i=0;i<=2;i++)
	{
	printf("%s\t\t%d\t%d\n",per[i].name,per[i].date,per[i].salary);
	}
getch();
return 0;
}
