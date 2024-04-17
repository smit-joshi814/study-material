/*
####	RADIX SORT		####

SORTING BY DIGITS
FIND MAXIMUM NUMBER
MAKE ALL NUMBERS LIKE MAXIMUM NUMBER WITHOUT CHANGING THE VALUE OF NUMBER
EX: 324,045,001

FOR NUMBERS BASE IS		 10
FOR ALPHABETS BASE IS	 25

TIME COMPLECITY
==>	O(d*(n+b))	<==
d=number of digits
n=how many numbers
b=base

	### COUNTING SORT ###
	
	-> SORTING ACCORDING TO KEYS
	-> COUNTING THE ELEMENTS HAVING DISTINCT KEY VALUES
	
	TIME COMPLECITY OF COUNTING SORT
	==>	O(n+k)	<==
		n=number of elements in the array
		k=the given range
		upper limit for the k can be O(n)
		cound sort will not work for negative or 
		floating point vales



*/

#include<stdio.h>
#define N 100

void RadixSort(int Arr[],int n);
void CountingSort(int Arr[],int n,int pos);
int main(){
	int n,Result,i;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	RadixSort(&Arr[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void RadixSort(int Arr[],int n){
	int max=0,pos,i;
	for(i=0;i<n;i++){
		if(Arr[i]>max){
			max=Arr[i];
		}
	}
	for(pos=1;max/pos>0;pos=pos*10){
		CountingSort(&Arr[0],n,pos);
	}
}
void CountingSort(int Arr[],int n,int pos){
	int i,k=10;
	int Count[k],B[n];
	
	for(i=0;i<k;i++){
		Count[i]=0;
	}
	for(i=0;i<n;i++){
		++Count[(Arr[i]/pos)%10];
	}
	for(i=1;i<k;i++){
		Count[i]=Count[i]+Count[i-1];
	}
	for(i=n-1;i>=0;i--){
		B[--Count[(Arr[i]/pos)%10]]=Arr[i];
	}
	for(i=0;i<n;i++){
		Arr[i]=B[i];
	}
}
