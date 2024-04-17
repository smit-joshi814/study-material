/*
implemaintaction Of Circular Queue
*/
#include<stdio.h>
#include<stdlib.h>
#define N 5

int queue[N];
int front=-1,rear=-1;
//Function Declaractions
void Enque();
void Deque();
void Peek();
void Display();

//Driver Program
int main(){
	int choice;
	do{
		printf("\n***Circular Queue***\n");
		printf("1. Enque\n");
		printf("2. Deque\n");
		printf("3. Peek\n");
		printf("4. Display\n");
		printf("0 To Exit\n");
		printf("Enter Choice ");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				Enque();
				break;
			case 2:
				Deque();
				break;
			case 3:
				Peek();
				break;
			case 4:
				Display();
				break;
			case 0:
				exit(0);
				break;
			default:
				printf("\n!Wrong Choice!\n");
		}
	}while(choice!=0);
	return 0;
}

//To insert element
void Enque(){	
	int x;
	if(front==-1 && rear==-1){
		printf("\nEnter X ");
		scanf("%d",&x);
		front=rear=0;
		queue[rear]=x;
	}
	else if((rear+1)%N==front){
		printf("\nQueue Is Full\n");
	}
	else{
		printf("\nEnter X ");
		scanf("%d",&x);
		rear=(rear+1)%N;
		queue[rear]=x;
	}
}

//to delete element
void Deque(){
	if(front==-1 && rear==-1){
		printf("\nQueue Is Empty\n");
	}
	else if(front==rear){
		front=rear=-1;
	}
	else{
		printf("%d",queue[front]);
		front=(front+1)%N;
	}
}

//to see top of the queue
void Peek(){
	if(front==-1 && rear==-1){
		printf("\nQueue Is Empty\n");
	}
	else{
		printf("%d ",queue[front]);
	}
}

//to display circular queue
void Display(){
	int i=front;
	if(front==-1 && rear==-1){
		printf("\nQueue Is Empty\n");
	}
	else{
		while(i!=rear){
			printf("%d ",queue[i]);
			i=(i+1)%N;
		}
		printf("%d",queue[i]);
	}
}
