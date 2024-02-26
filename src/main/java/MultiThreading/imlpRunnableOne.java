package MultiThreading;

public class imlpRunnableOne implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread1: " + i);
        }
    }
}
