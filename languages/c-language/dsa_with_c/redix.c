#include<stdio.h>

void redix(int arr[],int n);

int main(){
	int arr[100],i,n;
	printf("what's Your Limit ? ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter %d Data ",i+1);
		scanf("%d",&arr[i]);
	}
	redix(&arr[0],n);
	printf("Sorted Successfully\n");
	for(i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	return 0;
}
void redix(int *arr,int n){
	int max,i,digit,power,new_arr[n],j,count[10],num;
	max=arr[0];
	for(i=1;i<=n;i++){
		if(max<arr[i]){
			max=arr[i];
		}
	}
	digit=0;
	while(max>0){
		digit++;
		max/=10;
	}
	power=1;
	for(i=1;i<=digit;i++){


		for(j=0;j<10;j++){
			count[j]=0;
		}
			
			
			for(j=0;j<n;j++){
				num=(arr[j]/power)%10;
				count[num]++;
			}
			
			for(j=1;j<10;j++){
				count[j]+=count[j-1];
			}
			
			for(j=n-1;j>=0;j--){
				num=(arr[j]/power)%10;
				new_arr[count[num]-1]=arr[j];
				count[num]--;
			}
			
			for(j=0;j<n;j++){
				arr[j]=new_arr[j];
			}
				
			
				power*=10;
			}
}
