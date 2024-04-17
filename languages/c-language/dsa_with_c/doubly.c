/* creation of Doubly linked list & Operations On Doubly Linked List
	->insertion
		->at begning
		->at end
		->at specific position
		->after specific position
	-> Deletion
		->at begning
		->at end
		->at specific position
		->after specific position
	->find the length of list
	->reverce the list
// Created By SMIT
*/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>


struct node{
	int data;
	struct node *next;
	struct node *prev;
};
struct node *head=0,*newnode,*temp,*tail;
void CreateDoubly();	//creates Doubly Link List
void DisplayDoubly();	//Display Doubly Link List
void InsAtBeg();		//Insert At the begning Of list
void InsAtPos();		//Insert At Given position in List
void InsAfterPos();		//Insert After Given Position In List
void InsAtEnd();		//Insert At the End Of the list
void DelAtBeg();		//Delete At the Begning Of the List
void DelAtPos();		//Delete At given Position in List
void DelAfterPos();		//Delete After Given Positon In list
void DelAtEnd();		//Delete At the End Of List
void DoublyLength();	//find the length of Doubly link list
void ReverseDoubly();	//Reverse The Link List

//Main
int main(){
	int choice;
	//While Loop For Selecting Choice It will exit while user type 13
	while(choice!=13){ 
		printf("\n\n*****Main Menu*****\n");
		printf("\n1.  Create");
		printf("\n2.  Display");
		printf("\n3.  insert at Begning");
		printf("\n4.  insert at position");
		printf("\n5.  insert after position");
		printf("\n6.  insert at End");
		printf("\n7.  Delete At Begning");
		printf("\n8.  Delete At Position");
		printf("\n9.  Delete After Position");
		printf("\n10. Delete At End");
		printf("\n11. Find the length of list");
		printf("\n12. Reverse Doubly Link List");
		printf("\n13. exit\n");
		printf("\nEnter Choice ");
		scanf("%d",&choice);
		
		//Switch case according To the Selection Of user
		switch(choice){
			case 1:
				CreateDoubly();
				break;
			case 2:
				DisplayDoubly();
				break;
			case 3:
				InsAtBeg();
				break;
			case 4:
				InsAtPos();
				break;
			case 5:
				InsAfterPos();
				break;
			case 6:
				InsAtEnd();
				break;
			case 7:
				DelAtBeg();
				break;
			case 8:
				DelAtPos();
				break;
			case 9:
				DelAfterPos();
				break;
			case 10:
				DelAtEnd();
				break;
			case 11:
				DoublyLength();
				break;
			case 12:
				ReverseDoubly();
				break;
			case 13:
				exit(0);
				break;
			default:
				printf("Error Please Try Again");
				break;
		}
				
	}
	return 0;
}

//This Function will Create Doubly Link List
void CreateDoubly(){
	int choice=1;
	while(choice){
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter Data:");
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
		tail=newnode;
	}
	printf("Press 0 to exit Press 1 To Add ");
	scanf("%d",&choice);
	}
}
//This Function Will Display Doubly Link List
void DisplayDoubly(){
	temp=head;
	while(temp!=0){
		printf("\n%d",temp->data);
		temp=temp->next;
	}
}

//This Function will Insert in doubly link list at begingng
void InsAtBeg(){
	temp=head;
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter Data: ");
	scanf("%d",&newnode->data);
	temp->prev=newnode;
	newnode->next=temp;
	newnode->prev=0;
	head=newnode;
	printf("\nNode Created Successfully");
}
//This Function will Insert in doubly link list at Given position
void InsAtPos(){
	temp=head;
	int pos,i;
	printf("Enter position ");
	scanf("%d",&pos);
	for(i=1;i<pos-1;i++){
		temp=temp->next;
	}
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter Data ");
	scanf("%d",&newnode->data);
	newnode->next=temp->next;
	newnode->prev=temp;
	temp->next->prev=newnode;
	temp->next=newnode;
	printf("\nNode Inserted successfully");
}
//This Function will Insert in doubly link list after Given position
void InsAfterPos(){
	temp=head;
	int i,pos;
	printf("Insert Position ");
	scanf("%d",&pos);
	for(i=1;i<pos;i++){
		temp=temp->next;
	}
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter Data");
	scanf("%d",&newnode->data);
	newnode->next=temp->next;
	newnode->prev=temp;
	temp->next->prev=newnode;
	temp->next=newnode;
	printf("\nNode created Successfully");
}
//This Function will Insert in doubly link list at End
void InsAtEnd(){
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&newnode->data);
	newnode->next=0;
	newnode->prev=tail;
	tail->next=newnode;
	tail=newnode;
	printf("\nNode Inserted Successfully");
}

//This function will delete the node at begning
void DelAtBeg(){
	temp=head;
	head=temp->next;
	head->prev=0;
	free(temp);
	printf("\nNode Deleted Successfully");
}

//This function will delete the node at Given Position
void DelAtPos(){
	temp=head;
	int i,pos;
	printf("Enter Position ");
	scanf("%d",&pos);
	for(i=1;i<pos;i++){
		temp=temp->next;
	}
	temp->prev->next=temp->next;
	temp->next->prev=temp->prev;
	free(temp);
	printf("\nNode Deleted Successfully");
}

//This function will delete the node after given position
void DelAfterPos(){
	temp=head;
	int i,pos;
	printf("Enter Position ");
	scanf("%d",&pos);
	for(i=1;i<pos+1;i++){
	temp=temp->next;
	}
	temp->prev->next=temp->next;
	temp->next->prev=temp->prev;
	free(temp);
	printf("\nNode Deleted Successfully");
}

//This function will delete the node at End
void DelAtEnd(){
	tail=tail->prev;
	free(tail->next);
	tail->next=0;
	printf("\nNode Deleted Successfully");
}

//This Function will find the length of List
void DoublyLength(){
	temp=head;
	int count=1;
	while(temp->next!=0){
		temp=temp->next;
		count++;
		
	}
	printf("The length Of Doubly Link List is %d",count);
}


//This Function will reverse the List
void ReverseDoubly(){
struct node *nextnode;
temp=head;
while(temp!=0){
	nextnode=temp->next;
	temp->next=temp->prev;
	temp->prev=nextnode;
	temp=nextnode;
	}
	temp=head;
	head=tail;
	tail=temp;
	printf("Link Reversed Successfully");
}

//that's it  This is all about Doubly link list
//your logic may be differ
