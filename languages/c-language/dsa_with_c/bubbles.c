#include<stdio.h>

void bubble(int a[],int n);	

int main(){
	int a[100],n,i;

	printf("Enter your Limit ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d Data ",i+1);
		scanf("%d",&a[i]);
	}
	
bubble(&a[0],n);

printf("Data Shorted Successfully\n");
for(i=0;i<n;i++){
	printf("%d ",a[i]);
}
	return 0;
}
void bubble(int *a,int n){
	int pass,i,temp;
	for(pass=0;pass<n-1;pass++){
		for(i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			}

		}
}
