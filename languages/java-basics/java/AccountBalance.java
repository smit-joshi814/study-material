//A simple package
package mypack;

class AccountBalance{
	public static void main(String[] args){
		Balance current[]=new Balance[3];
		
		current[0]=new Balance("Smit Joshi",12000);
		current[1]=new Balance("Ishu",12000);
		current[2]=new Balance("Joshi Vijay",1100);

		for(int i=0;i<3;i++) current[i].show();
	}
}

class Balance{
	String name;
	double bal;

	Balance(String n,double b){
		name=n;
		bal=b;
	}

	void show(){
		if(bal<0)
			System.out.println("---> ");
		System.out.println(name+" : $"+bal);
	}
}
