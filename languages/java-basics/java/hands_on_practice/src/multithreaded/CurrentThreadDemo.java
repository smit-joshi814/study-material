package multithreaded;

class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);

		// change the name of the thread
		t.setName("my thread");

		System.out.println("After Name change: " + t);

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}
