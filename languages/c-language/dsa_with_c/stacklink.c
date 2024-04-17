//Implemaintation Of stack Using Link List
#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *link;
};
struct node *top=0;

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
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter Data ");
	scanf("%d",&newnode->data);
	newnode->link=top;
	top=newnode;
}

void pop(){
	struct node *temp;
	if(top==0){
		printf("\nUnderflow");
	}
	else{
		temp=top;
		printf("\n%d is deleted",top->data);
		top=top->link;	
		free(temp);
	}
}

void peek(){
	if(top==0){
		printf("stack is empty");
	}
	else{
		printf("\n %d is top most element in stack",top->data);
	}	
}

void Display(){
	struct node *temp;
	if(top==0){
		printf("stack is empty");
	}
	else{
		temp=top;
		while(temp!=0){
			printf("\n%d",temp->data);
			temp=temp->link;
		}	
	}
}
