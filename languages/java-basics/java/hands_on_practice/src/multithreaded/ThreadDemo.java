package multithreaded;

class NewThread implements Runnable {
	// create new thread
	Thread t;

	NewThread() {
		t = new Thread(this, "SMIT");
		System.out.println("Chiled Thread: " + t);
		t.start();
	}

	// This is Entry point for second thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Interrupted: " + e);
		}
		System.out.println("Child Thread Exiting");
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		new NewThread(); // create a new thread
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted: " + e);
		}
		System.out.println("Main Thread Exiting");
	}
}
