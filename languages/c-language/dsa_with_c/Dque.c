/*	
implementection of deque
*/


#include<stdio.h>
#include<stdlib.h>
#define N 5

//Global Var Declaractions
int F=-1,R=-1;
int dque[N];

//Function declaractions
void EnqueFront(int x);	//Insert From Front
void EnqueRear(int x);	//Insert From Rear
void DequeFront();		//Delete From Front
void DequeRear();		//Delete From Rear
void Display();			//Display

//Driver Program
int main(){
	int choice,x;
	do{
		printf("\n\n**Deque Operactions**\n");
		printf("1. Enque Front\n");
		printf("2. Enque Rear\n");
		printf("3. Deque Front\n");
		printf("4. Deque Rear\n");
		printf("5. Display\n");
		printf("0 To exit\n");
		printf("Enter Choice");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				printf("\nEnter Value ");
				scanf("%d",&x);
				EnqueFront(x);
				break;
			case 2:
				printf("\nEnter Value ");
				scanf("%d",&x);
				EnqueRear(x);
				break;
			case 3:
				DequeFront();
				break;
			case 4:
				DequeRear();
				break;
			case 5:
				Display();
				break;
			case 0:
				exit(0);
				break;
			default:
				printf("\n! Wrong Choice !");
		}
	}while(choice!=0);
	return 0;
}

//Insert From Front
void EnqueFront(int x){
	if(F==0 && R==N-1 || F==(R+1)){
		printf("\nQueue Is Full\n");
	}
	else if(F==-1 && R==-1){
		F=R=0;
		dque[F]=x;
	}
	else if(F==0){
		F=N-1;
		dque[F]=x;
	}
	else{
		F--;
		dque[F]=x;
	}
}

//Insert From Rear
void EnqueRear(int x){
	if(F==0 && R==N-1 || F==(R+1)){
		printf("\nQueue Is Full\n");
	}
	else if(F==-1 && R==-1){
		F=R=0;
		dque[R]=x;
	}
	else if(R==N-1){
		R=0;
		dque[R]=x;
	}
	else{
		R++;
		dque[R]=x;
	}
}

//Delete From Front
void DequeFront(){
	if(F==-1 && R==-1){
		printf("\nQueue Is Empty\n");
	}
	else if(F==R){
		F=R=-1;
	}
	else if(F==N-1){
		printf("%d ",dque[F]);
		F=0;
	}
	else{
		printf("%d ",dque[F]);
		F++;
	}
}

//Delete From Rear
void DequeRear(){
	if(F==-1 && R==-1){
		printf("\nQueue Is Empty\n");
	}
	else if(F==R){
		F=R=-1;
	}
	else if(R==0){
		printf("%d",dque[R]);
		R=N-1;
	}
	else{
		printf("%d",dque[R]);
		R--;
	}
}

//To See the Deque
void Display(){
	int i=F;
	if(F==-1 && R==-1){
		printf("\nQue Is Empty\n");
	}
	else{
		while(i!=R){
			printf("%d ",dque[i]);
			i=(i+1)%N;
		}
		printf(" %d",dque[i]);
	}
}
