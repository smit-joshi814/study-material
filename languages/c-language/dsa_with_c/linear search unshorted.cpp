//Linear search algorithm
//#in unshorted array

#include<iostream>

using namespace std;

int main(){
	int arry[10]={1,5,6,2,3,7,10,8,4,9},n,temp=0;
	cout<<"Enter the element you want to find"<<endl;
	cin>>n;
	if(n<arry[10]){
		for(int i=0;i<arry[10];i++){
			if(n==arry[i]){
				temp=arry[i];
				cout<<"the Elemet "<<temp<<" found at array index "<<i<<endl;
				break;
			}
		}
	}
	if(temp==0){
		cout<<"element not present in array"<<endl;
	}
	
	return 0;
}
