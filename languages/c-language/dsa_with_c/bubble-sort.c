/*
####	BUBBLE SORT		####

TIME COMPLECITY
IN BEST CASE 	O(n)
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100

int BubbleSort(int Arr[],int n);

int main(){
	int n,Result,i;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	Result=BubbleSort(&Arr[0],n);
	printf("Sorted Successfully In %d passes.\n",Result);
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}

//OPTIMISED BUBBLE SORT
int BubbleSort(int Arr[],int n){
	int pass,i,temp,flag;
	
	for(pass=0;pass<n-1;pass++){
		flag=0;
		for(i=0;i<n-1-pass;i++){
			if(Arr[i]>Arr[i+1]){
				temp=Arr[i];
				Arr[i]=Arr[i+1];
				Arr[i+1]=temp;
				flag=1;
			}
		}
		if(flag==0){
			break;
		}
	}
	return pass+1;
}
