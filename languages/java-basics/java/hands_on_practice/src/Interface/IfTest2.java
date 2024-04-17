package Interface;

class DynStack implements IntStack {
	private int top;
	private int[] stck;

	DynStack(int size) {
		top = -1;
		stck = new int[size];
	}

	@Override
	public void push(int i) {
		if (top > stck.length - 1) {
			System.out.println("Stack Overflow");
		} else {
			stck[++top] = i;
		}
	}

	@Override
	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			return stck[top--];
		}
	}
}

class IfTest2 {
	public static void main(String[] args) {
		DynStack stack = new DynStack(10);

		for (int i = 1; i <= 10; i++)
			stack.push(i);

		for (int i = 0; i < 10; i++)
			System.out.println("stck[" + i + "] " + stack.pop());
	}
}
