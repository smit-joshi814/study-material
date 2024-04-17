#include<stdio.h>
#include<conio.h>
#include <malloc.h>


int main ()
{

  struct node
  {

    int data;
    struct node *next;
  };
  struct node *head, *newnode, *temp;
  head = 0,temp;
  int choice = 1,count=0;
  while (choice)
    {
      newnode = (struct node *) malloc (sizeof (struct node));
      printf ("Enter value\t");
      scanf ("%d",&newnode->data);
      newnode->next=0;
      if (head == 0)
	{
	  head = temp = newnode;
	}
      else
	{
	  temp->next = newnode;
	  temp = newnode;
	}
      printf ("0 to exit 1 to continue\t");
      scanf ("%d", &choice);
      count++;
    }
    temp=head;
    printf("\n\n%d Nodes created successfully",count);
  while (temp != 0)
    {
      printf ("\n%d", temp->data);
      temp=temp->next;
    }
  return 0;
}
