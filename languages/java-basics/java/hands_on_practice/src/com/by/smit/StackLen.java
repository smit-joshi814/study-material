package com.by.smit;

class Stack1 {
	private int top;
	private int[] stck;

	Stack1(int size) {
		stck = new int[size];
		top = -1;
	}

	void push(int n) {
		if (top == stck.length - 1) {
			System.out.println("Stack is full ");
		} else {
			stck[++top] = n;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Underflow on stack");
			return 0;
		} else {
			return stck[top--];
		}
	}
}

class StackLen {
	public static void main(String[] args) {
		Stack1 mystack = new Stack1(10);
		Stack1 mystack1 = new Stack1(20);

		for (int i = 11; i <= 20; i++) {
			mystack.push(i);
			mystack1.push(i + 10);
		}
		System.out.println("S1 S2");
		for (int i = 0; i < 10; i++) {
			System.out.print(mystack.pop() + " ");
			System.out.println(mystack1.pop());
		}
	}
}
