package Interface;

class FixedStack implements IntStack {
	private int top;
	private int[] stck;

	FixedStack() {
		top = -1;
		stck = new int[10];
	}

	@Override
	public void push(int i) {
		if (top == 9) {
			System.out.println("Stack overflow");
		} else {
			stck[++top] = i;
		}
	}

	@Override
	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else
			return stck[top--];
	}
}

class IfTest {
	public static void main(String[] args) {
		FixedStack stack1 = new FixedStack();

		for (int i = 1; i <= 10; i++)
			stack1.push(i);

		for (int i = 0; i < 10; i++)
			System.out.println("stck[" + i + "] " + stack1.pop());
	}
}
