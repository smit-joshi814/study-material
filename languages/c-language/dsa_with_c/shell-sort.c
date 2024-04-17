/*
####	SHELL SORT		####


TIME COMPLECITY
time complecity depends on the distance you take
IN WROST CASE 	O(n^2)

*/

#include<stdio.h>
#define N 100
#define false 0
#define true 1
void ShellSort(int Arr[],int n);

int main(){
	int n,Result,i;
	int Arr[N];
	printf("How many numbers You want to insert ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d value ",i+1);
		scanf("%d",&Arr[i]);
	}
	
	ShellSort(&Arr[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",Arr[i]);
	}
	return 0;
}


void ShellSort(int Arr[],int n){
	int d,k,key,flag,j;
	for(d=n/2;d>=1;d=d/2){
		for(k=d;k<n;k++){
			key=Arr[k];
			j=k-d;
			flag=false;
			while(j>=0&&flag==false){
				if(key<Arr[j]){
					Arr[j+d]=Arr[j];
					j=j-d;
				}
				else{
					flag=true;
				}
			}
			Arr[j+d]=key;
		}
	}
}
