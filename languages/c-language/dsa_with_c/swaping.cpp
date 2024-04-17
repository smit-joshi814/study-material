// Swapping two integers using pointer

#include<iostream>

using namespace std;

int main(){
	int a=10,b=20,temp;
	int *p,*q;
	cout<<"before swapping"<<endl<<"a=> "<<a<<endl<<"b=> "<<b<<endl;
	p=&a;
	q=&b;
	temp=*p;
	*p=*q;
	*q=temp;
	cout<<"After swapping"<<endl<<"a=> "<<a<<endl<<"b=> "<<b<<endl;	
	return 0;
}
