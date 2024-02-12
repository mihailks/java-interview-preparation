package MultiThreading;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i < 10; i++) {
            System.out.println(Thread.currentThread() + " " + i);
        }
    }
}
