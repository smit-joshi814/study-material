#include<stdio.h>
#include<conio.h>



struct employee{
	char name[20];
	char city[20];
	int salary;
}emp,*p;

int main(){	
	p=&emp;
	
	printf("Enter name :");
	scanf("%s",p->name);
	printf("Enter city :");
	scanf("%s",p->city);
	printf("Enter salary:");
	scanf("%d",&p->salary);
	
	printf("EMPLOYEE DETAILS");
	printf("\n name: %s \n city: %s\n salary: %d",p->name,p->city,p->salary);
	return 0;
}
