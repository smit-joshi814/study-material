#include <stdio.h>
 
int main()
{
	int a[5]={6,-5,80,65,45},pass,i,temp,n=5;
	for(pass=0;pass<n-1;pass++){
		for(i=0;i<n-1;i++){
			printf("In \n");
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				printf("shorted successfully\n");
				}
			}

		}
		for(i=0;i<n;i++){
		printf("%d ",a[i]);
			}
	return 0;
}
