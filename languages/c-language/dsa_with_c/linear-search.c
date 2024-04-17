/*
####  LINEAR SEARCH  #####

iterative approach #using For Loop

## TIME COMPLECITY ##
IN BEST CASE 		O(1)
IN WROST CASE 		O(n)
IN AVERAGE CASE	= 	SUM OF ALL THE CASES / TOTAL NO OF CASES
IN AVERAGE CASE		O(n+1)/2

*/
#include<stdio.h>
#define N 100

int Arr[N];

int LinearSearch(int Arr[],int search);

int main(){
	int ins,i,search,Result;
	printf("How many Numbers You want To insert ? ");
	scanf("%d",&ins);
	for(i=0;i<ins;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	printf("Which Number's Position You want to Search ?");
	scanf("%d",&search);
	
	Result=LinearSearch(&Arr[0],search);
	
	if(Result!=0){
		printf("\nThe Element Found At described Position is %d",Result);
	}
	return 0;
}

int LinearSearch(int Arr[],int search){
	int i,found=0;
	for(i=0;i<search;i++){
		if(Arr[i]==search){
			found=Arr[i];
			printf("The Position Of Element Is %d ",i+1);
			return found;
			break;
		}
		else if(found==Arr[i]){
			printf("\n ! Element Does Not Exist In System !");
			return 0;		
		}
	}
}
