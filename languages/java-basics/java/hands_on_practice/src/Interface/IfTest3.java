package Interface;

class IfTest3 {
	public static void main(String[] args) {
		IntStack mystack; // create an interface referance variable
		DynStack ds = new DynStack(12);
		FixedStack fs = new FixedStack();

		mystack = ds; // load dynamic stack
		// push some numbers onto the stack
		for (int i = 0; i < 12; i++)
			mystack.push(i);

		mystack = fs; // load fixed stack
		for (int i = 0; i < 8; i++)
			mystack.push(i);

		mystack = ds;
		System.out.println("Values in dynamic stack");
		for (int i = 0; i < 12; i++)
			System.out.println(mystack.pop());

		mystack = fs;
		System.out.println("Values in Fixed stack");
		for (int i = 0; i < 8; i++)
			System.out.println(mystack.pop());
	}
}
