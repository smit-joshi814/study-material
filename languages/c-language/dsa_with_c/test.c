#include<stdio.h>
#include<stdlib.h>
int main(){
	int *ptr;
	
	ptr=(int *)malloc(sizeof(int));
	
	printf("memory allocated successfully %p",ptr);
	
	return 0;
}
