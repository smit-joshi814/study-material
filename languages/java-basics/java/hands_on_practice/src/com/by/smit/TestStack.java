package com.by.smit;

class Stack {
	int stck[] = new int[10];
	int top;

	// constructor
	Stack() {
		top = -1;
	}

	// push An item into stack
	void push(int i) {
		if (top == 9)
			System.out.println(" Over Flow ");
		else
			stck[++top] = i;
	}

	// pop an item from stack
	int pop() {
		if (top < 0) {
			System.out.println(" Undrflow");
			return 0;
		} else
			return stck[top--];
	}
}

class TestStack {
	public static void main(String[] args) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		int i;

		// pushing elements into stack1
		for (i = 0; i < 10; i++) {
			mystack1.push(i);
		}

		// pushing elemets into stack2
		for (i = 10; i < 20; i++) {
			mystack2.push(i);
		}

		System.out.println("Displaying Stack 1");
		// Pop an item from stack1
		for (i = 0; i < 10; i++) {
			System.out.println(mystack1.pop());
		}

		System.out.println("Displaying Stack 2");
		// Pop an item from stack2
		for (i = 0; i < 10; i++) {
			System.out.println(mystack2.pop());
		}
	}
}
