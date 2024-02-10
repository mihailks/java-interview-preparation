package MultiThreading;

public class ThreadOne extends Thread {

    public ThreadOne(String threadName){
        super(threadName); // ако искаме да нишката да си има име
    }

    @Override
    public void run(){

        for (int i = 0; i < 5; i++) {
            System.out.println("inside "+ Thread.currentThread() + " " + i);
        }

    }

}
