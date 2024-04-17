#include<stdio.h>

int find(int arr[],int n);

int main(){
	int arr[100],n,i,ans;
	
	printf("What's Your Limit ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d Element ",i+1);
		scanf("%d",&arr[i]);
	}
	ans= find(&arr[0],n);
		if(ans<=n){
		printf("Element found At position %d ",ans);
		}
		else{
			printf("Element not Found");
		}
	return 0;
}
int find(int *arr,int n){
	int i,x;
	printf("Search ?! ");
	scanf("%d",&x);
	for(i=0;i<n;i++){
		if(x==arr[i]){
		x=i;
		break;
		}
	}
	return x+1;
}
