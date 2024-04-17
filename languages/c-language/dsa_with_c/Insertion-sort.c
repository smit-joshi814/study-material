/*
####	INSERTION SORT		####

IN INSERTION SORT FIRST ELEMENT WILL BE CONSIDERED AS SORTED

SORTED SUBLIST | UNSORTED SUBLIST


TIME COMPLECITY
IN BEST CASE 	O(n)
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100

void InsertionSort(int Arr[],int n);

int main(){
	int n,Result,i;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	InsertionSort(&Arr[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void InsertionSort(int Arr[],int n){
	int i,j,temp;
	
	for(i=1;i<n;i++){
		temp=Arr[i];
		j=i-1;
		while(j>=0 && Arr[j]>temp){
			Arr[j+1]=Arr[j];
			j--;
		}
		Arr[j+1]=temp;
	}
}
