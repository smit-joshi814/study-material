#include<stdio.h>

void insertion(int a[],int n);

int main(){
	int a[100],i,n;
	
	printf("whats your maximum limit ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter Elements ");
		scanf("%d",&a[i]);
	}
	insertion(&a[0],n);
	printf("Shorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}
void insertion(int *a,int n){
	int k,j,f=0,key;
	for(k=2;k<=n;k++){
		key=a[k];
		j=k-1;
		f=0;
		while(j<=1 && f==0){
			if(a[k]<=a[j]){
				a[j+1]=a[j];
				j--;
			}
			else{
				f=1;
			}
		}
		a[j+1]=key;
	}
}
