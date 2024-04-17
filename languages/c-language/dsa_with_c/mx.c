#include<stdio.h>

int main(){
	int a[5]={10,20,50,30,40};
	int max=0,i;
	for(i=0;i<5;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	printf("%d",max);
}
