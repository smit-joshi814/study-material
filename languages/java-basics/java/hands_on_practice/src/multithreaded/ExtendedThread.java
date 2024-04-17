package multithreaded;

class NewThread1 extends Thread {
	NewThread1() {
		// create a new, second thread
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
		start(); // start the method
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child thread interrupted: " + e);
		}
		System.out.println("Child Threa Exiting");
	}
}

class ExtendedThread {
	public static void main(String[] args) {
		new NewThread1(); // create a new thread

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupte: " + e);
		}
		System.out.println("Main thread Exiting");
	}
}
