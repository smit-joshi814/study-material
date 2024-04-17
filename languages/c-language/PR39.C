#include<stdio.h>
#include<conio.h>
main()
{
struct employee
{
char name[20],city[20];
int salary;
}emp,*p;
//clrscr();
printf("Enter employee name city & salary");
scanf("%s\t%s\t%d",emp.name,emp.city,&emp.salary);
p=&emp;
printf("name:%s\ncity:%s\nsalary:%d",p->name,p->city,p->salary);
getch();
return 0;
}
