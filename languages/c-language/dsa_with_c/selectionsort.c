#include<stdio.h>
#include<conio.h>
#define true 1
#define false 0

void insertion(int a[],int n);

int main(){
	int a[100],i,n;
	printf("What's Your limit ? ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("Enter %d Data ",i);
		scanf("%d",&a[i]);
	}
	insertion(&a[0],n);
	printf("Sorted successfully\n");
	for(i=1;i<=n;i++){
		printf(" %d ",a[i]);
	}
	return 0;
}
void insertion(int *a,int n){
	int sorted,k,j,pivot;
	for(k=2;k<=n;k++){
		pivot=a[k];
		j=k-1;
		sorted=false;
		while(j>=1 &&sorted==false){
			if(pivot<a[j]){
				a[j+1]=a[j];
				j--;
			}
			else{
				sorted=true;
			}
		}
		a[j+1]=pivot;
	}
}
