#include<stdio.h>

int main(){
	int pass,a[5]={50,40,-5,30,15},i,temp,n=5;
	
	for(pass=0;pass<n-1;pass++){
		for(i=pass+1;i<n;i++){
			if(a[pass]>a[i]){
				temp=a[pass];
				a[pass]=a[i];
				a[i]=temp;
			}
		}
	}
	printf("Shorted array is \n");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}
