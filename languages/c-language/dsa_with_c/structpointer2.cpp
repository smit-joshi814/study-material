#include<stdio.h>
#include<conio.h>

using namespace std;

struct employee{
	char name[50];
	char city[50];
	int salary;
};

int main(){	
struct employee emp[3];
struct employee *p=NULL;
	p=emp;
	int i;
	for(i=0;i<3;i++)	{
	printf("Enter Details Of Employee %d\n",(i+1));
	printf("Enter name :");
	scanf("%s",p->name);
	printf("Enter city :");
	scanf("%s",p->city);
	printf("Enter salary:");
	scanf("%d",&p->salary);
	p++;
}
	
	p=emp;	//reseting pointer
	
	printf("\nEMPLOYEE DETAILS\n");
	for(i=0;i<3;i++){
	printf("\n name: %s \n city: %s\n salary: %d",p->name,p->city,p->salary);
	p++;
}
getch();
	return 0;
}
