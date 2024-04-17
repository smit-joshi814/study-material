package string;

class getCharsDemo {
	public static void main(String[] args) {
		String s = "This is a demo of the getChars method";
		int start = 15;
		int end = 20;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}