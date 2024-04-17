#include<stdio.h>

void selection(int a[],int n);

int main(){
	
	int a[100],n,i;
	
	printf("Enter Your limit ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++){
		printf("Enter %d Data ",i+1);
		scanf("%d",&a[i]);
	}
	
	selection(&a[0],n);
	
	printf("Data Shorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	
	return 0;
}
void selection(int *a,int n){
	int pass,i,temp;
	for(pass=0;pass<n-1;pass++){
		for(i=pass+1;i<n;i++){
			if(a[pass]>a[i]){
				temp=a[pass];
				a[pass]=a[i];
				a[i]=temp;
			}
		}
	}
}
