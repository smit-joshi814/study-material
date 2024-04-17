/*
Definactions :
	Stack is a non-premitive data Structure
	in which Insertion and delection operations
	perform at only one end and That end is known as top.
	
	Stack is a last in first out data structure 
	in which insertion and delection operaction
	perform at same end and That end is known as top.

*/

#include<stdio.h>
#include<stdlib.h>
#define N 5

//FUNCTIONS
void push();
void pop();
void peep();
void change();
void Display();


//GLOBAL 
int stack[N];
int top=0;

//DRIVER PROGRAM
int main(){
	int choice=0;
	while(choice!=6){
		printf("\n***STACK MENU***\n\n");
		printf("\n1. PUSH");
		printf("\n2. POP");
		printf("\n3. PEEK");
		printf("\n4. CHANGE");
		printf("\n5. DISPLAY");
		printf("\n6. EXIT");
		printf("\nENTER CHOICE ");
		scanf("%d",&choice);
			switch(choice){
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					peep();
					break;
				case 4:
					change();
					break;
				case 5:
					Display();
					break;
				case 6:
					exit(0);
				default:
					printf("\nERROR:-> WRONG CHOICE ");
					break;
			}
	}
	return 0;
}

//TO PUSH THE ELEMENTS IN STACK
void push(){
	int x;
	if(top==N){
		printf("\nOVERFLOW ON PUSH");
	}
	else{
		printf("ENTER X ");
		scanf("%d",&x);
		top++;
		stack[top]=x;
		Display();
	}
}

//TO POP THE FIRST ELEMENT FROM THE STACK
void pop(){
	if(top==0){
		printf("\n UNDERFLOW ON POP");
	}
	else{
		printf("\n%d Deleted",stack[top]);
		top--;
	}
}

//TO SEE ELEMENT AT GIVEN POSITION (LIFO)
void peep(){
	int pos,x;
	printf("ENTER POSITION ");
	scanf("%d",&pos);
	if(top-pos+1<=0){
		printf("\nUNDERFLOW ON PEEP");
	}
	else if(top-pos+1>N){
		printf("\nOVERFLOW ON PEEP");
	}
	else{
		x=stack[top-pos+1];
		printf("%d",x);
	}
}

//TO CHANGE ELEMENT AT GIVEN POSITION (LIFO)
void change(){
	int pos,x;
	printf("ENTER POSITION ");
	scanf("%d",&pos);
	if(top-pos+1<=0){
		printf("\nUNDERFLOW ON CHANGE");
	}
	else if(top-pos+1>N){
		printf("\nOVERFLOW ON CHANGE");
	}
	else{
		printf("ENTER X ");
		scanf("%d",&x);
		stack[top-pos+1]=x;
	}
}


//TO DISPLAY STACK
void Display(){
	int i;
	for(i=top;i>0;i--){
		printf("%d ",stack[i]);
	}
}
