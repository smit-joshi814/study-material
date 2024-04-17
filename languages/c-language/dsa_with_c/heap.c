#include<stdio.h>

void insertion(int a[],int n);
void heap(int a[],int n);

int main(){
	int a[100],i,n;
	printf("What's Your Limit ? ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("Enter %d Data ",i);
		scanf("%d",&a[i]);
	}
	heap(&a[0],n);
	printf("Sorted Data\n");
	for(i=1;i<=n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}
void heap(int *a,int n){
	int i,j,k,key;
	
	for(k=2;k<=n;k++){
		i=k;
		key=a[k];
		j=i/2;
		while(key>=a[j]&&i>1){
			a[i]=a[j];
			i=j;
			j=i/2;
			if(j<1){
				j=1;
			}
		}
		a[i]=key;
	}
	insertion(&a[0],n);
}
void insertion(int *a,int n){
	int key,i,j,f,k;
	
	for(k=2;k<=n;k++){
		key=a[k];
		j=k-1;
		f=0;
		while(j>=1&&f==0){
			if(key<a[j]){
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
