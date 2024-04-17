#include<stdio.h>
#define true 1
#define false 0

void quick(int a[],int lb,int ub);
int lb,ub;
int main(){
	int a[100],i,n;
	
	printf("What's Your limit? ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("Enter %d Data ",i);
		scanf("%d",&a[i]);
	}
	lb=1;
	ub=n;
	quick(&a[0],lb,ub);
	printf("Sorted successfully\n");
	for(i=1;i<=n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}
void quick(int *a,int lb,int ub){
	int pivot,i,j,flag,temp;
	flag=true;
	if(lb<ub){
		i=lb;
		j=ub+1;
		pivot=a[lb];
		while(flag){
			i=i+1;
		while(a[i]<pivot){
			i++;
			j--;
		}
		while(a[j]>pivot){
			j--;
		}
		if(i<j){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		else{
			flag=false;
			temp=a[lb];
			a[lb]=a[j];
			a[j]=temp;
			quick(a,lb,j-1);
			quick(a,j+1,ub);
		}
	}
}
}
