/*
####	SELECTION SORT		####

IN SELECTION SORT SORTED LIST IS INITIALLY EMPTY
SORTED SUBLIST	| UNSORTED SUBLIST


FIND MINIMUM ELEMET AND THAT ELEMENT WOULD BE SWAPPED WITH 
THE ELEMENT WHICH IS AT THE STARTING POSITION IN THE UNSORTED SUB ARRAY


TIME COMPLECITY
IN BEST CASE 	O(n^2)
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100

void SelectionSort(int Arr[],int n);

int main(){
	int n,Result,i;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	SelectionSort(&Arr[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void SelectionSort(int Arr[],int n){
	int pass,i,temp;
	for(pass=0;pass<n-1;pass++){
		for(i=pass+1;i<n;i++){
			if(Arr[pass]>Arr[i]){
				temp=Arr[pass];
				Arr[pass]=Arr[i];
				Arr[i]=temp;
			}
		}
	}
}
