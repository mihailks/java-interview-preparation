package MultiThreading;

public class imlpRunnableTwo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread2: " + i);
        }
    }
}
