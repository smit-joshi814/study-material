/*
####	HEAP SORT		####

MAX HEAP
FOR EVERY NODE i , THE VALUE OF NODE IS 
LESS THEN OR EQUAL TO ITS PARENT VALUE. except root node
A[Parent[i]] >= A[i]

MIN HEAP
FOR EVERY NODE i, THE VALUE OF HEAP IS
GREATER THAN OR EQUAL TO ITS PARENT VALUE. except root node
A[Parent[i]] <= A[i]

TIME COMPLECITY
IN BEST CASE 	O(n)
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100

void HeapSort(int a[],int n);
void insertion(int a[],int n);
int main(){
	int n,Result,i;
	int a[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&a[i]);
	}
	
	HeapSort(&a[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}


void HeapSort(int a[],int n){
	int i,j,k,key;
	
	for(k=2;k<=n;k++){
		i=k;
		key=a[k];
		j=i/2;
		while(key>=a[j]&&i>1){
			a[i]=a[j];
			i=j;
			j=i/2;
			if(j<1){
				j=1;
			}
		}
		a[i]=key;
	}
	insertion(&a[0],n);
}
void insertion(int *a,int n){
	int i,j,temp;
	
	for(i=1;i<n;i++){
		temp=a[i];
		j=i-1;
		while(j>=0 && a[j]>temp){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
}
