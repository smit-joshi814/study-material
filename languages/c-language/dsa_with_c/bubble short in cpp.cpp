#include<iostream>

using namespace std;

int main(){
	int arr[5],i,n=5,temp;
	//input
	for(i=0;i<n;i++){
		cout<<"Add "<<i+1<<"Element"<<endl;
		cin>>arr[i];
	}
	
	//main shorting precess
	for(int pass=0;pass<=n-1;pass++){
		for(i=0;i<pass-i;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	
	//output
	cout<<"Shorted Elements Are"<<endl;
	for(i=0;i<n;i++){
		
		cout<<" "<<arr[i];
	}
	return 0;
}
