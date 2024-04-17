package io;

import java.io.PrintWriter;

class PrintWriteDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string");
		int i = 80;
		pw.println(i);
		double d = 8.6;
		pw.println(d);
	}
}
