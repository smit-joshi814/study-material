/*
####	QUICK SORT		####

BASED ON DIVIED AND QUANQUER TECHNICH
PARTITION IS KNOWN AS THE BACKBONE OF THE QUICK SORT


TIME COMPLECITY
IN BEST CASE 	O(nlogn)
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100
#define true 1
#define false 0

void QuickSort(int Arr[],int lb,int ub);
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
	QuickSort(&Arr[0],lb,ub);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void QuickSort(int Arr[],int lb,int ub){
int pivot,i,j,flag,temp;
	flag=true;
	if(lb<ub){
		i=lb;
		j=ub+1;
		pivot=Arr[lb];
		while(flag){
			i=i+1;
			while(Arr[i]<pivot){
				i++;
				j--;
			}
			while(Arr[j]>pivot){
				j--;
			}
			if(i<j){
				temp=Arr[i];
				Arr[i]=Arr[j];
				Arr[j]=temp;
			}
			else{
				flag=false;
				temp=Arr[lb];
				Arr[lb]=Arr[j];
				Arr[j]=temp;
				QuickSort(Arr,lb,j-1);
				QuickSort(Arr,j+1,ub);
			}
		}
	}
}
