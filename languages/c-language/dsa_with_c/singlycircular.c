#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node *temp,*tail=0;
struct node *head=0;

//Function Declaractions
void CreateCll();	//create Circular Link list
void DisplayCll();	//Dislpay circular Link List
void InsAtBeg();	//Insert At Begning
void InsAtPos();	//Insert At Given position
void InsAfterPos();	//Insert After Given Position
void InsAtEnd();	//Insert At End
void DelAtBeg();	//Delete At Begning
void DelAtPos();	//Delete at Given position
void DelAfterPos();	//Delete After Given Position
void DelAtEnd();	//Deleta At end
void GetLen();		//Gets The Length Of Circular Link list
void ReverseCll();	//Reverse The circular Link  list

int main(){
	int choice;
	while(choice!=13){
		printf("\n\n***MAIN MENU***\n\n");
		printf("1. Create Circular Link List\n");
		printf("2. Insert At Begning\n");
		printf("3. Insert at Given Position\n");
		printf("4. Insert After Given Position\n");
		printf("5. Insert At End\n");
		printf("6. Delete At Begning\n");
		printf("7. Delete At Given Position\n");
		printf("8. Delete After Given Position\n");
		printf("9. Delete At End\n");
		printf("10. Find The Length Of The List\n");
		printf("11. Reverse The List\n");
		printf("12. Display Link List\n");
		printf("13. Exit\n");
		printf("\nEnter choice ");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				CreateCll();
				break;
			case 2:
				InsAtBeg();
				break;
			case 3:
				InsAtPos();
				break;
			case 4:
				InsAfterPos();
				break;
			case 5:
				InsAtEnd();
				break;
			case 6:
				DelAtBeg();
				break;
			case 7:
				DelAtPos();
				break;
			case 8:
				DelAfterPos();
				break;
			case 9:
				DelAtEnd();
			case 10:
				GetLen();
				break;
			case 11:
				ReverseCll();
				break;
			case 12:
				DisplayCll();
				break;
			case 13:
				exit(0);
				break;
			default:
				printf("\n Enter Valid Choice\n");
		}
	}
	return 0;
}
/* //Created With Both Head And Tail
void CreateCll(){
	struct node *newnode;
	int choice=1;
	while(choice){
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("\nEnter Data ");
		scanf("%d",&newnode->data);
		newnode->next=0;
		if(head==0){
			head=tail=newnode;
			//tail->next=head;
		}
		else{
			tail->next=newnode;
			tail=newnode;
			//tail->next=head;	
		}
		tail->next=head;
		printf("\n0 To Exit 1 To Add");
		scanf("%d",&choice);
	}
}
*/

/* This Function Will Create Circular List Only By Tail Pointer */
void CreateCll(){
	struct node *newnode;
	int choice=1;
	while(choice){
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("\nEnter Data ");
		scanf("%d",&newnode->data);
		newnode->next=0;
		if(tail==0){
			tail=newnode;
			tail->next=newnode;
		}
		else{
			newnode->next=tail->next;
			tail->next=newnode;
			tail=newnode;
		}
		printf("\n0 To Exit 1 To Add ");
		scanf("%d",&choice);
	}
}

void DisplayCll(){
	//temp=head;
	temp=tail->next;  /*Only if List Is Created Only With Tail Pointer */
	printf("Displaing Circular Link List\n");
	do{
		printf("%d ",temp->data);
		temp=temp->next;
	}while(temp!=tail->next);
}


//To Insert At Begning
void InsAtBeg(){
	struct node *newnode;
	if(tail==0)	{
		printf("\nCreate A List Firt\n");
	}
	else{
		temp=tail->next;
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("Enter Data ");
		scanf("%d",&newnode->data);
		newnode->next=temp;
		tail->next=newnode;
		printf("\nNode Created Successfully");
	}
}

//To insert At Given Position
void InsAtPos(){
	int pos,i;
	struct node *newnode;
	if(tail==0){
		printf("\nCreate A List Firt\n");
	}
	else{
		temp=tail->next;
		printf("Enter position ");
		scanf("%d",&pos);
		if(pos==1){
			printf("You've Chosen Wrong Option\n");
			printf("if you want to insert at begning then choose '2' \n");
		}
		else{
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("Enter Data ");
		scanf("%d",&newnode->data);
			for(i=1;i<pos-1;i++){
				temp=temp->next;
			}
			newnode->next=temp->next;
			temp->next=newnode;
			printf("Node Created Successfully\n");
		}
	}
}

//To insert Atfrt Given position
void InsAfterPos(){
	int pos,i;
	struct node *newnode;
	if(tail==0){
		printf("\nCreate A List First");
	}
	else{
		printf("Enter Position ");
		scanf("%d",&pos);
		if(pos==1){
			printf("You've Chosen Wrong Option\n");
			printf("if you want to insert at begning then choose '2' \n");
		}
		else{
			temp=tail->next;
			newnode=(struct node*)malloc(sizeof(struct node));
			printf("Enter Data ");
			scanf("%d",&newnode->data);
			for(i=1;i<pos;i++){
				temp=temp->next;
			}
			newnode->next=temp->next;
			temp->next=newnode;
			printf("\n Node created successfully\n");
		}
	}
}

//To insert at end
void InsAtEnd(){
	struct node *newnode;
	if(tail==0){
		printf("Create List Firt");
	}
	else{
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("Enter Data ");
		scanf("%d",&newnode->data);
		newnode->next=tail->next;
		tail->next=newnode;
		tail=newnode;
		printf("\nNode Created Successfully\n");
	}
}

//Delete At begning
void DelAtBeg(){
	if(tail==0){
		printf("Create List First\n");
	}
	else{
	temp=tail->next;
	tail->next=temp->next;
	free(temp);
	printf("\nNode Deleted Successfully\n");
	}
}

//Delete At Given position
void DelAtPos(){
	int pos,i;
	struct node *del;
	if(tail==0){
		printf("You can't Delete Node Without Creating It\n");
	}
	else{
		printf("Enter Position ");
		scanf("%d",&pos);
		if(pos==1){
			DelAtBeg();
		}
		else{
			temp=tail->next;
			for(i=1;i<pos-1;i++){
			temp=temp->next;
			}
			del=temp->next;
			temp->next=del->next;
			free(del);
			printf("Node Deleted Successfully");	
		}
	}
}

//Delete after given Position
void DelAfterPos(){
	int pos,i;
	struct node *del;
	if(tail==0){
		printf("You can't Create Node Without Creating It\n");
	}
	else{
		printf("Enter Position ");
		scanf("%d",&pos);
		if(pos==1){
			DelAtBeg();
		}
		else{
			temp=tail->next;
			for(i=1;i<pos;i++){
			temp=temp->next;
			}
			del=temp->next;
			temp->next=del->next;
			free(del);
			printf("Node Deleted Successfully");	
		}
	}
}

//Delete At end
void DelAtEnd(){
	struct node *prev;
	if(tail==0){
		printf("You can't delete Node Without Creating ");
	}
	else{
		temp=tail->next;
		while(temp->next!=tail->next){
			prev=temp;
			temp=temp->next;
		}
		prev->next=tail->next;
		tail=prev;
		free(temp);
		printf("\n node deleted success fully\n");
	}
}

//To Get The Length of Circular Link list
void GetLen(){
	int count=1;
	temp=tail->next;
	while(temp->next!=tail->next){
		temp=temp->next;
		count++;
	}
	printf("Lenghth Of List Is %d ",count);
}

//To Reverse Circular Link List
void ReverseCll(){
struct node *current,*prev,*nextnode;
	current=tail->next;
	nextnode=current->next;
	if(tail==0){
		printf("List is Empty");
	}
	else if(tail->next==tail){
		DisplayCll();
	}
	else{
		while(current!=tail){
			prev=current;
			current=nextnode;
			nextnode=current->next;
			current->next=prev;
		}
		nextnode->next=tail;
		tail=nextnode;
		printf("Reversed Successfully\n");
	}
}

//This Is All About Singly Circular Link List
//Created By SMIT
