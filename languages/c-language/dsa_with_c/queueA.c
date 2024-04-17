/*
Definition: 
	Queue is a non-linear premitive Data Structure in which
	insertion operactions perform at One end named Rear and
	deletion operactions perform at another end named Front.
	
	Queue is a first in first out Data structure in which
	insertion operactions perform at rear end and 
	delection operactions perform at front end


Applicactions Of Queue
	1.	Queues are widely used as waiting lists for a single
		shared resource like printer, disk, CPU.
	2.	Queues are used in asynchronous transfer of data
		(where data is not being transferred at the same rate between two processes)
		for eg. pipes, file IO, sockets.
	3.	Queues are used as buffers in most of the applications
		like MP3 media player, CD player, etc.
	4.	Queue are used to maintain the play list in media players
		in order to add and remove the songs from the play-list.
	5.	Queues are used in operating systems for handling interrupts.


TIME COMPLEXITY
FOR INSERTION AND DELECTION 	0(1)
IN WROST CASE 					O(n)

Linear Queue Impmelaintaction
*/

#include<stdio.h>
#include<stdlib.h>
#define N 5

//GLOBAL
int queue[N];
int front=-1,rear=-1;

//FUNCTIONS
void enque();
void deque();
void display();
void peek();

//DRIVER PROGRAM
int main(){
	int choice;
	do{
		printf("\n***Queue Operations***\n");
		printf("1. Enque\n");
		printf("2. Deque\n");
		printf("3. Peek\n");
		printf("4. Display\n");
		printf("0 To Exit\n");
		printf("Enter Choice");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				enque();
				break;
			case 2:
				deque();
				break;
			case 3:
				peek();
				break;
			case 4:
				display();
				break;
			case 0:
				exit(0);
				break;
			default:
				printf("\n!!Wrong choice!!\n");
		}
	}while(choice!=0);
	return 0;
}

//TO INSERT AN ELEMENT
void enque(){
	int x;
	if(rear==N-1){
		printf("\noverflow\n");
	}
	else if(front==-1 && rear==-1){
		front++;
		rear++;
		printf("Enter x ");
		scanf("%d",&x);
		queue[rear]=x;
	}
	else{
		rear++;
		printf("Enter x ");
		scanf("%d",&x);
		queue[rear]=x;
	}
}

//TO DELETE AN ELEMENT
void deque(){
	if(front==-1&&rear==-1){
		printf("\nQueue is Empty\n");
	}
	else if(front==rear){
		front=rear=-1;
		printf("\nDeleted successfully\n");
	}
	else{
		front++;
		printf("\nDeleted successfully\n");
	}
}

//TO SEE THE TOP ELEMENT OF QUEUE
void peek(){
	if(front==-1 && rear==-1){
		printf("\n Queue is Empty\n");
	}
	else{
		printf("%d",queue[front]);
	}
}

//TO DISPLAY THE QUEUE
void display(){
	int i;
	if(front==-1 && rear==-1){
		printf("\nQueue is Empty\n");
	}
	else{
		for(i=front;i<=rear;i++){
			printf("%d ",queue[i]);
		}
	}
}
