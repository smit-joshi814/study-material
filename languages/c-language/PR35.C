#include<stdio.h>
#include<conio.h>

struct student
{
int marks;
char name[15],branch[10];
}stud[10];

int main()
{
int i;
//clrscr();
printf("Enter student name branchh and marks");
for(i=1;i<=2;i++)
{
printf("\nstudent %d data\n",i);
scanf("%s%s%d",stud[i].name,stud[i].branch,&stud[i].marks);
}
printf("\n\tname\tBranch\t\tMarks");
for(i=1;i<=2;i++)
{
printf("\n\t%s\t%s\t\t%d",stud[i].name,stud[i].branch,stud[i].marks);
}
getch();
return 0;
}

