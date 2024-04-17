//Binarysearch algorithm

#include<iostream>

using namespace std;

int main(){
	int array[10]={1,2,3,4,5,6,7,8,9,10},n,temp,lb=1,ub=10;
	cout<<"Enter element you want to find"<<endl;
	cin>>n;
	int i=1;
	while(lb<=ub){
		temp=(lb+ub)/2;
		if(n<temp){
			ub=temp-1;
		}
		else if(n>temp){
			lb=temp+1;
		}
		else if(n==temp){
			cout<<"Element found on "<<i<<" try"<<endl;
			break;
		}
		i++;
	}
	return 0;
}
