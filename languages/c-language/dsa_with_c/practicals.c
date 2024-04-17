/*1. Write a c program for swapping two integer numbers using pointer */
#include<stdio.h>
#include<conio.h>



int main(){
	int a,b,temp,*p,*q;
	printf("Enter two valies");
	scanf("%d%d",&a,&b);
	
	p=&a;
	q=&b;
	temp=*p;
	*p=*q;
	*q=temp;
	printf("The swapped values are %d %d",*p,*q);
	
	return 0;
}

/*2.Write a c program for introduction of pointer as structure */

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
