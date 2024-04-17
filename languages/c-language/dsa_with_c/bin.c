#include<stdio.h>

int main(){
	int i,n,k[100],d;
	int binary(int k[],int n);
	
	printf("Enter limit->");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++){
		scanf("%d",&k[i]);
	}
	d=binary(k,n);
	printf("\nPosition->%d",d);
	return 0;
}
int binary(int k[],int n){
	int low,high,mid,x;
	low=1;
	high=n;
	printf("Enter x");
	scanf("%d",&x);
	while(low<=high){
		mid=(low+high)/2;
		if(x>k[mid]){
			low=mid+1;
		}
		else if(x<k[mid]){
			high=mid-1;
		}
	}
		if(k[mid]==x){
			printf("successfull search");
			return mid;
		}
		else{
			printf("unsuccessfull search");
			return 0;
			
		}
}
