#include<stdio.h>

void merge(int a[],int b[],int i,int j,int n1,int n2);

int main(){
	int a[100],b[100],i,j,n1,n2;
	printf("What's your Limit ? ");
	scanf("%d",&n1);
	for(i=0;i<n1;i++){
		printf("Enter %d Data ",i+1);
		scanf("%d",&a[i]);
	}
	printf("What's your limit? ");
	scanf("%d",&n2);
	for(j=0;j<n2;j++){
		printf("Enter %d Data ",j+1);
		scanf("%d",&b[j]);
	}
	
	
	merge(&a[0],&b[0],i,j,n1,n2);
	
	
	return 0;
}
void merge(int *a,int *b,int i,int j,int n1,int n2){
	int c[100],k;
	i=j=k=0;
	while(i<n1 && j<n2){
		if(a[i]<=b[j]){
			c[k]=a[i];
			i+=1;
			k+=1;
		}
		else{
			c[k]=b[j];
			j+=1;
			k+=1;
		}
	}
	if(i>n1){
		while(j<n2){
			c[k]=b[j];
			j+=1;
			k+=1;
		}
	}
	else{
		while(i<n1){
			c[k]=a[i];
			i+=1;
			k+=1;
		}
	}
	printf("Sorted successfully \n");
	for(k=0;k<n1+n2;k++){
		printf("%d ",c[k]);
	}
}
