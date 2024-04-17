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
