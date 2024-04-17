package com.by.smit;

class RecTest {
	int values[];

	RecTest(int i) {
		values = new int[i];
	}

	// display array -- recursively
	void printArray(int i) {
		if (i == 0)
			return;
		else
			printArray(i - 1);
		System.out.println("[" + (i - 1) + "] " + values[i - 1]);
	}
}

class Recursion2 {
	public static void main(String[] args) {
		RecTest obj = new RecTest(10);

		for (int i = 11; i <= 20; i++)
			obj.values[i - 11] = i;
		obj.printArray(10);
	}
}
