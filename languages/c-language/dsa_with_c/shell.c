/*
<< Algorithm >>
Step 1
	Read a[n]
Step 2
	Repeat for d=n/2 to 1 step by d/2
		Repeat for k=d/2 to n step by one
			key<-a[k]
			j<-j-d
			f<-0
			
			Repeat while j>=1 and f=0
				if(key<=a[j]) then
					a[j+d]=a[j]
					j<-j-d
				else
					f<-1
				End if
			End while
		a[j+d]<-key
		End for(k)
	End for(d)

Step 3
	write a[n]

*/
#include<stdio.h>
#define true 1
#define false 0

void shell(int a[],int n);

int main(){
	int a[100],i,n;
	printf("What's Your limit ? ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("Enter %d Data ",i);
		scanf("%d",&a[i]);
	}
	shell(&a[0],n);
	printf("Sorted successfully\n");
	for(i=1;i<=n;i++){
		printf("%d ",a[i]);
	}
	return 0;
}
void shell(int *a,int n){
	int d,k,key,flag,j;
	for(d=n/2;d>=1;d=d/2){
		for(k=d+1;k<=n;k++){
			key=a[k];
			j=k-d;
			flag=false;
			while(j>=1&&flag==false){
				if(key<a[j]){
					a[j+d]=a[j];
					j=j-d;
				}
				else{
					flag=true;
				}
			}
			a[j+d]=key;
		}
	}
}
