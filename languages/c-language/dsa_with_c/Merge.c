#include<stdio.h>

int main(){
	int a[5]={1,3,5,7,8},n1=5,b[3]={2,4,6},n2=3,c[8],i,j,k,temp;
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
	
	for(k=0;k<n1+n2;k++){
		printf("%d ",c[k]);
	}
	return 0;
}
