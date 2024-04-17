/*
####	MERGE SORT		####



TIME COMPLECITY
IN BEST CASE 	O(nlogn)
IN WROST CASE 	O(nlogn)

*/

#include<stdio.h>
#define N 100
#define true 1
#define false 0

void MergeSort(int Arr[],int lb,int ub);
void Merge(int Arr[],int lb,int mid,int ub);
int main(){
	int n,Result,i,lb,ub;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	lb=0;
	ub=n;
	MergeSort(&Arr[0],lb,ub);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void MergeSort(int Arr[],int lb,int ub){
	int mid;
	if(lb<ub){
		mid=(lb+ub)/2;
		MergeSort(Arr,lb,mid);
		MergeSort(Arr,mid+1,ub);
		Merge(Arr,lb,mid,ub);
	}
}
void Merge(int Arr[],int lb,int mid,int ub){
	int i,j,k;
	int B[100];
	i=lb;
	j=mid+1;
	k=lb;
	while(i<=mid && j<=ub){
		if(Arr[i]<=Arr[j]){
			B[k]=Arr[i];
			i++;
		}
		else{
			B[k]=Arr[j];
			j++;
		}
		k++;
	}
	if(i>mid){
		while(j<=ub){
			B[k]=Arr[j];
			j++;
			k++;
		}
	}
	else{
		while(i<=mid){
			B[k]=Arr[i];
			i++;
			k++;
		}
	}
	for(k=lb;k<=ub;k++){
		Arr[k]=B[k];
	}
}
