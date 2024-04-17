#include<stdio.h>

int search(int a[],int n);

int main(){
	int a[100],n,i,ans;
	printf("What's your limit ? ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++){
		printf("Enter %d element ",i+1);
		scanf("%d",&a[i]);
	}
	ans=search(&a[0],n);
	printf("Element Found %d ",ans+1);
	return 0;
}
int search(int *a,int n){
	int low=1,high=n,mid,x;
	printf("Search ?!");
	scanf("%d",&x);
	mid=(low+high)/2;
	while(low<=high){
		if(x<a[mid]){
			high=mid-1;
		}
		else if(x>a[mid]){
			low=mid+1;
		}
		else if(x==a[mid]){
			return mid;
			break;
		}
		else{
			return 0;
		}
	}	
}
