#include<stdio.h>
#include<stdlib.h>
#define N 5

void Push(int x);
void Pop();
void Peek();
void Change(int Pos);
void Display();
void Peep(int Pos);
int Stack[N];
int top=-1;

int main(){
	int choice,x,Pos;
	do{
		printf("\n***STACK MENU***\n");
		printf("1. PUSH\n");
		printf("2. POP\n");
		printf("3. PEEK\n");
		printf("4. CHANGE\n");
		printf("5. PEEP\n");
		printf("6. DISPLAY\n");
		printf("0 TO EXIT\n");
		printf("ENTER CHOICE\n");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				printf("\nEnter x ");
				scanf("%d",&x);
				Push(x);
				break;
			case 2:
				Pop();
				break;
			case 3:
				Peek();
				break;
			case 4:
				printf("Enter Position ");
				scanf("%d",&Pos);
				Change(Pos);
				break;
			case 5:
				printf("\nEnter Position ");
				scanf("%d",&Pos);
				Peep(Pos);
				break;
			case 6:
				Display();
				break;
			default:
				printf("\n!Wrong Choice");
		}
	}while(choice!=0);
	return 0;
}

void Push(int x){
	if(top==N-1){
		printf("\nStack Is Full");
	}
	else{
		top++;
		Stack[top]=x;
	}
}

void Pop(){
	if(top==-1){
		printf("\nStack is Empty");
	}
	printf("\n%d poped",Stack[top]);
	top--;
}

void Peek(){
	if(top==-1){
		printf("\nStack Is Empty");
	}
	else{
		printf("\nTop is %d",Stack[top]);
	}
}

void Display(){
	int i;
	if(top==-1){
		printf("\nStack is Empty");
	}
	for(i=top;i>=0;i--){
		printf("%d ",Stack[i]);
	}
}

void Change(int Pos){
	int x;
	if(top-Pos+1<0){
		printf("\nUnderflow On Change");
	}
	else{
		printf("Enter X ");
		scanf("%d",&x);
		Stack[top-Pos+1]=x;
	}
}

void Peep(int Pos){
	if(top-Pos+1<0){
		printf("\nUnderflow On Change");
	}
	else{
		printf("%d",Stack[top-Pos+1]);
	}
}
