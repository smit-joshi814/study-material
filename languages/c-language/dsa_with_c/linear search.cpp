//Linear search algorithm
//#in shorted array

#include<iostream>

using namespace std;

int main(){
	int arry[10]={1,2,3,4,5,6,7,8,9,10},n,temp=0;
	cout<<"Enter the element you want to find"<<endl;
	cin>>n;
	if(n<arry[10]){
		for(int i=0;i<arry[9];i++){
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
