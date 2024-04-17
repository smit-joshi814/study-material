
class AA {

    static synchronized void a1() {
        System.out.println("a1 is executing......");
        BB.b2();
    }

    static synchronized void a2() {
        System.out.println("a2 is executing......");
    }
}

class BB {

    static synchronized void b1() {
        System.out.println("b1 is executing......");
        AA.a2();
    }

    static synchronized void b2() {
        System.out.println("b2 is executing......");
    }
}

class ThreadA extends Thread {

    Thread t;

    ThreadA() {
        t = new Thread();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                AA.a1();
                Thread.sleep(50);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ThreadB extends Thread {

    Thread t;

    ThreadB() {
        t = new Thread();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                BB.b1();
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class PR30 {

    public static void main(String args[]) {
        try {
            ThreadA ta = new ThreadA();
            ThreadB tb = new ThreadB();
            ta.start();
            tb.start();
            ta.join();
            tb.join();
        } catch (Exception e) {
        }
    }

}