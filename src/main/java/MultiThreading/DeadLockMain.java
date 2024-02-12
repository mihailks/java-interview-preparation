package MultiThreading;

public class DeadLockMain {

    public static void main(String[] args) {

        System.out.println("Main is starting");

        String lockOne = "lockOne";
        String lockTwo = "lockTwo";

        Thread threadOne = new Thread(() -> {
        synchronized (lockOne){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lockTwo){
                System.out.println("Lock acquired");
            }
        }
        }, "threadOne");

        Thread threadTwo = new Thread(() -> {
            synchronized (lockTwo){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                synchronized (lockOne){
                    System.out.println("Lock acquired");
                }
            }
        }, "threadTwo");


        threadOne.start();
        threadTwo.start();

    }
}
