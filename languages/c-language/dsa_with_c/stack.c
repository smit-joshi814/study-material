#include<stdio.h>
#include<stdlib.h>
#define N 5
int top=-1;
int stack[N];
void push();
void pop();
void peek();
void Display();

int main(){
		int choice=1;
		while(choice!=5){
			printf("\n\n\nWelcome To stack\n\n");
			printf("1. Push\n");
			printf("2. Pop\n");
			printf("3. Peek\n");
			printf("4. Display\n");
			printf("5. Exit\n");
			scanf("%d",&choice);
		switch(choice){
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
			case 4:
				Display();
				break;
			case 5:
				exit(0);
			default:
				printf("Enter valid choice");
		}
	}
	return 0;
}

void push(){
	int x;
	if(top==N-1){
		printf("Overflow");
	}
	else{
		printf("Enter Data ");
		scanf("%d",&x);
		top++;
		stack[top]=x;
	}
}
void pop(){
	int item;
	if(top==-1){
		printf("underflow");
	}
	else{
		item=stack[top];
		top--;
		printf("%d deleted\n",item);
	}
}
void peek(){
	if(top==-1){
		printf("underflow");
	}
	else{
		printf("\n%d",stack[top]);
	}
}
void Display(){
	int i;
	if(top==-1){
		printf("Stack Is Empty");
	}
	else{
		for(i=top;i>=0;i--){
			printf("%d\n",stack[i]);
		}	
	}
}
