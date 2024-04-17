#include<stdio.h>

void selection(int a[],int n);

int main(){
	int a[100],i,n;
	
	printf("What's your limit ? ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("Enter %d data ",i);
		scanf("%d",&a[i]);
	}
	selection(a,n);
	printf("Data shorted successfully\n");
	for(i=1;i<=n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}

void selection(int a[],int n){
	int i,pass,min,temp;
	
	for(pass=1;pass<=n-1;pass++){
		min=pass;
		for(i=pass+1;i<=n;i++){
			if(a[i]<a[min]){
				min=i;
			}
			if(pass!=min){
				temp=a[pass];
				a[pass]=a[min];
				a[min]=temp;
			}
		}
	}
}
