#include<stdio.h>

int main(){
	int a[5],pass,i,temp,n=5;
	
	for(i=0;i<n;i++){
		printf("Add %d Element ",i+1);
		scanf("%d",&a[i]);
	}
	for(pass=0;pass<n-1;pass++){
		for(i=0;i<pass-i;i++){
			printf("in \n");
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				printf("shorted successfully \n");
			}
		}
	}
	printf("Shorted elements are \n");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	
	return 0;
}
