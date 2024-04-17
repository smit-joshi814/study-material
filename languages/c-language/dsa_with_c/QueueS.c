/*
implemaintaction Of Queue using Stack
*/
#include<stdio.h>
#define N 5

int stack1[N],stack2[N];
int top1=-1,top2=-1,count=0;

void Enqueue(int x);
void Dequeue();
void Display();
void push1(int data);
void push2(int data);
int pop1();
int pop2();

int main(){
	int choice,x;
		do{
		printf("\n***Circular Queue***\n");
		printf("1. Enqueue\n");
		printf("2. Dequeue\n");
		printf("3. Display\n");
		printf("0 To Exit\n");
		printf("Enter Choice ");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				printf("Enter x ");
				scanf("%d",&x);
				Enqueue(x);
				break;
			case 2:
				Dequeue();
				break;
			case 3:
				Display();
				break;
			default:
				printf("\n!Wrong Choice!\n");
		}
	}while(choice!=0);	
	return 0;
}

void Enqueue(int x){
	push1(x);
	count++;
}
void Dequeue(){
	int i,a,b;
	if(top1==-1 && top2==-1){
		printf("\nQueue Is Empty");
	}
	else{
		for(i=0;i<count;i++){
			a=pop1();
			push2(a);
		}
		b=pop2();
		printf("Dequeued Element is %d",b);
		count--;
		for(i=0;i<count;i++){
			a=pop2();
			push1(a);
		}
	}
}
void push1(int data){
	if(top1==N-1){
		printf("\nOverflow\n");
	}
	else{
		top1++;
		stack1[top1]=data;
	}
}
void push2(int data){
	if(top2==N-1){
		printf("\nOverflow\n");
	}
	else{
		top2++;
		stack2[top2]=data;
		count++;
	}
}
int pop1(){
	return stack1[top1--];
}
int pop2(){
	return stack2[top2--];
}
void Display(){
	int i;
	for(i=0;i<=top1;i++){
		printf("%d ",stack1[i]);
	}
}
