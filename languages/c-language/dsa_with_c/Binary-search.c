/*
	#### BINARY SEARCH ####
	
	!!!! WHILE APPLAING BINARY SEARCH DATA MUST BE SORTED !!!!

	=>BINARY SEARCH IS BASED ON DIVIED & CONQUAR RULE

	MID	= L+R/2
	
	THREE CASES POSSIBLE
	1. DATA YOU WANT TO FIND OUT IS EQUAL TO MID POSITION
	2. DATA YOU WANT TO FIND OUT IS LESS THAN MID POSITION
	3. DATA YOU WANT TO FIND OUT IS GREATER THAN MID POSITION
	
//	SUPPOSE WE  HAVE AN ARRAY SIZE OF 10 INDEX 0 TO 9
//	L	R	MID
//	0	9	4	(0+9/2)	
//	5	9	7	(5+9/2)
//	5	6	5	(5+6/2)
//	6	6	6	(6+6/2)

## TIME COMPLECITY ##
IN BEST CASE 		O(1)
IN WROST CASE 		O(log n)
IN AVERAGE CASE 	O(log n)

*/
#include<stdio.h>
#define N 100

int Arr[N];

int BinarySearch(int Arr[],int search,int n);

int main(){
	int n,i,search,Result;
	printf("How many Numbers You want To insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	printf("Which Number's Position You want to Search ?");
	scanf("%d",&search);
	
	Result=BinarySearch(&Arr[0],search,n);
	
	if(Result!=0){
		printf("\n The Element Found is %d",Result);
	}
	else{
		printf("Opps..!! \nThe Element you'r Searching Does not Exist in system ");
	}
	return 0;
}

int BinarySearch(int Arr[],int search,int n){
	int i,mid,l,r;
	l=0,r=n;
	while(l<r){
		mid=(l+r)/2;
		if(search==Arr[mid]){
			return Arr[mid];
		}
		else if(search<Arr[mid]){
			r=mid-1;
		}
		else if(search>Arr[mid]){
			l=mid+1;
		}
	}
	return 0;
}
