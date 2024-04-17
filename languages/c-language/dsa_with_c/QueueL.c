/* 
implemaintaction Of Queue using Link list
*/
#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node *front=0;
struct node *rear=0;

//Function Declaraction
void Enqueue();
void Dequeue();
void Peek();
void Display();

//Driver program
int main(){
	int choice;
	do{
		printf("\n***Queue Operactions Using Link List***\n");
		printf("1. Enqueue\n");
		printf("2. Dequeue\n");
		printf("3. Peek\n");
		printf("4. Display\n");
		printf("0 To Exit\n");
		printf("Enter choice ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:
				Enqueue();
				break;
			case 2:
				Dequeue();
				break;
			case 3:
				Peek();
				break;
			case 4:
				Display();
				break;
			default:
				printf("\n!Wrong Choice!\n");
		}
	}while(choice!=0);	
	return 0;
}

//Enqueue Operaction
void Enqueue(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter Data ");
	scanf("%d",&newnode->data);
	newnode->next=0;
	if(front==0&&rear==0){
		front=rear=newnode;
	}
	else{
		rear->next=newnode;
		rear=newnode;
	}
}

//Dequeue Operaction
void Dequeue(){
	struct node *temp;
	if(front==0 && rear==0){
		printf("\nQueue Is Empty\n");
	}
	else{
		temp=front;
		front=front->next;
		free(temp);	
		printf("\n Deleted Successfully\n");
	}
}

//Peek Operaction
void Peek(){
	if(front==0 && rear==0){
		printf("\nQueue Is Empty\n");
	}
	else{
		printf("\nFront Data Is %d",front->data);
	}
}

//Displays The Queue
void Display(){
	struct node *temp;
	temp=front;
	if(front==0 && rear==0){
		printf("\nQueue Is Empty\n");
	}
	else{
		printf("\n");
		while(temp!=0){
			printf("%d ",temp->data);
			temp=temp->next;
		}
	}
}
