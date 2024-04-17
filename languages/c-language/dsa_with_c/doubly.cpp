#include<stdio.h>

struct node{
	int data;
	struct node *next;
	struct node *prev;
};
struct node *head,*newnode,*temp;
void create();
void display();
int main(){
	int choice;
	switch(choice!=3){
		printf("\n1. create doubly link list");
		printf("\n2. display doubly link list");
		printf("\n3. exit");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			default:
				printf("error");
		}
				
	}
	return 0;
}
void create(){
	int choice=1;
	while(choice){
		newnode=(struct node *)malloc(sizeof(struct node));
	printf("enter data:");
	scanf("%d",&newnode->data);
	newnode->next=0;
	newnode->prev=0;
	if(head==0){
		head=temp=newnode;
	}
	else{
		temp->next=newnode;
		newnode->prev=temp;
		temp=newnode;
	}
	printf("Do you want to continue ? ");
	scanf("%d",&choice);
	}
}
void display(){
	temp=head;
	while(temp!=0){
		printf("%d ",temp->data);
		temp=temp->next;
	}
}
