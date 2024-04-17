/* creation of Doubly Circular linked list & Operations On Doubly Linked List
	->insertion
		->at begning
		->at end
		->at specific position

	-> Deletion
		->at begning
		->at end
		->at specific position

	->find the length of list
	->reverce the list
// Created By SMIT
*/


#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *prev;
	struct node *next;
};

struct node *head=0,*tail,*temp;

void CreateDcll();	//creates Doubly Circular link List
void DisplayDcll();	//Displays Doubly Circular Link List
void InsAtBeg();	//Insert At Begning
void InsAtPos();	//Insert At given Position
void InsAtEnd();	//insert at end
void DelAtBeg();	//Delete At Begning
void DelAtEnd();	//Delete At End
void DelAtPos();	//Delete At Position
void GetLen();		//Get The Length of List
void ReverseDcll();	//Reverses The Link List

//Main Program
int main(){
	int choice=1;
	while(choice!=11){
		printf("\n\n***MAIN MENU***\n\n");
		printf("1. Create Doubly Circular Link list\n");
		printf("2. Display\n");
		printf("3. Insert At Begning\n");
		printf("4. Insert At Position\n");
		printf("5. Insert At end\n");
		printf("6. Delete At Begning\n");
		printf("7. Delete At Position\n");
		printf("8. Delete At End\n");
		printf("9. Get Length Of list\n");
		printf("10. Reverse Link List\n");
		printf("11. exit\n");
		printf("Enter Choice ");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				CreateDcll();
				break;
			case 2:
				DisplayDcll();
				break;
			case 3:
				InsAtBeg();
				break;
			case 4:
				InsAtPos();
				break;
			case 5:
				InsAtEnd();
				break;
			case 6:
				DelAtBeg();
				break;
			case 7:
				DelAtPos();
			case 8:
				DelAtEnd();
				break;
			case 9:
				GetLen();
				break;
			case 10:
				ReverseDcll();
				break;
			case 11:
				exit(0);
				break;
			default:
				printf("error");
		}
	}
	return 0;
}

// To create Dcll
void CreateDcll(){
	struct node *newnode;
	int choice=1;
	while(choice){
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("Enter Data ");
		scanf("%d",&newnode->data);
		if(head==0){
			head=tail=newnode;
			newnode->next=head;
			newnode->prev=tail;
		}
		else{
			newnode->next=head;
			newnode->prev=tail;
			head->prev=newnode;
			tail->next=newnode;
			tail=newnode;
		}
		printf("0 to exit 1 to add ");
		scanf("%d",&choice);
	}
}

//To insert At Begning
void InsAtBeg(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&newnode->data);
	newnode->prev=tail;
	newnode->next=head;
	if(head==0){
		head=tail=newnode;
	}
	else{
		head->prev=newnode;
		tail->next=newnode;
		head=newnode;
	}
	printf("\nCreated Successfully");
}


//To insert At end
void InsAtEnd(){
	struct node *newnode;
	temp=head;
	newnode=(struct node*)malloc(sizeof(struct node));
		printf("Enter Data ");
		scanf("%d",&newnode->data);
	if(head==0){
		head=tail=newnode;
		newnode->next=head;
		newnode->prev=head;
	}
	else{
		newnode->next=head;
		newnode->prev=tail;
		tail->next=newnode;
		head->prev=newnode;
		tail=newnode;
	}
	printf("\nCreated Successfully");
}

//To insert at given position
void InsAtPos(){
		struct node *newnode;
		int i,pos;
		temp=head;
		printf("enter position ");
		scanf("%d",&pos);
		for(i=1;i<pos-1;i++){
			temp=temp->next;
		}
		if(pos==1){
			InsAtBeg();
		}
		else{
			newnode=(struct node*)malloc(sizeof(struct node));
			printf("Enter Data ");
			scanf("%d",&newnode->data);
			newnode->next=temp->next;
			newnode->prev=temp;
			temp->next->prev=newnode;
			temp->next=newnode;
			printf("\nCreated Successfully");
		}
}

//To Delete At begning
void DelAtBeg(){
	if(head==0){
		printf("list is empty");
	}
	else{
		temp=head;	
		head=head->next;
		head->prev=tail;
		tail->next=head;
		free(temp);
		printf("\nDeleted Successfully");	
	}
}


//To delete At End
void DelAtEnd(){
	if(head==0){
		printf("list is empty");
	}
	else{
		temp=tail;
		tail=tail->prev;
		tail->next=head;
		head->prev=tail;
		free(temp);
		printf("\nDeleted Successfully");	
	}
}


//To delete At given Position
void DelAtPos(){
	int pos,i;
	struct node *prev,*next;
	printf("Entro position ");
	scanf("%d",&pos);
	if(pos==1){
		DelAtBeg();
	}
	else{
		temp=head;
		for(i=1;i<pos;i++){
			temp=temp->next;
		}
		prev=temp->prev;
		next=temp->next;
		prev->next=temp->next;
		next->prev=temp->prev;
		free(temp);
		printf("\nDeleted Successfully");
	}
}


//To get the length of Dcll
void GetLen(){
	temp=head;
	int count=1;
	if(head==0){
		printf("list is empty");
	}
	else{
		do{
			temp=temp->next;
			count++;
		}while(temp->next!=tail->next);
		printf("%d",count);	
	}
}

//To Display Dcll
void DisplayDcll(){
	temp=head;
	do{
		printf("%d ",temp->data);
		temp=temp->next;
	}while(temp!=tail->next);
}

//To reverse Link list
void ReverseDcll(){
	struct node *nextnode;
	if(head==0){
		printf("list is empty");
	}
	else{
		temp=head;
		temp=temp->next;
		while(temp!=head){
			nextnode=temp->next;
			temp->next=temp->prev;
			temp->prev=nextnode;
			temp=nextnode;
		}
		nextnode=temp->next;
		temp->next=temp->prev;
		temp->prev=nextnode;
		head=tail;
		tail=temp;
		printf("link revresed successfully");
	}
}
//Created By SMIT
