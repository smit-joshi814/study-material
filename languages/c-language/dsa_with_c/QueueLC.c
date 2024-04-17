/*
implemaintaction Of Circular Queue Using Link List
*/
#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node *front=0,*rear=0;

void Enqueue();
void Dequeue();
void Peek();
void Display();


int main(){
	int choice;
	do{
		printf("\n***CIRCULAR QUEUE USING LINK LIST***\n");
		printf("1. ENQUEUE\n");
		printf("2. DEQUEUE\n");
		printf("3. PEEK\n");
		printf("4. DISPLAY\n");
		printf("0 TO EXIT\n");
		printf("Enter Choice ");
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

void Enqueue(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter Data ");
	scanf("%d",&newnode->data);
	newnode->next=0;
	if(rear==0){
		front=rear=newnode;
		rear->next=front;
	}
	else{
		rear->next=newnode;
		newnode->next=front;
		rear=newnode;
	}
}

void Dequeue(){
	struct node *temp;
	temp=front;
	if(front==0 && rear==0){
		printf("\nQueue Is Empty\n");
	}
	else if(front==rear){
		front=rear=0;
		free(temp);
		printf("\nDeleted Successfully\n");
	}
	else{
		front=front->next;	
		rear->next=front;
		free(temp);
		printf("\nDeleted Successfully\n");
	}
}

void Peek(){
	if(front==0 && rear==0)
	printf("\nQueue Is Empty\n");
	
	else
	printf("\n%d",front->data);
}

void Display(){
	struct node *temp;
	temp=front;
	if(front==0 && rear==0){
		printf("\nQueue Is Empty\n");
	}
	else{
		do{
			printf("%d ",temp->data);
			temp=temp->next;
		}while(temp!=rear->next);
	}
}
