package MultiThreading;

public class MainMultiThread {
    public static void main(String[] args) {

        Thread threadOne = new Thread(new imlpRunnableOne());
        Thread threadTwo = new imlpRunnableTwo();

        imlpRunnableOne asdfasf = new imlpRunnableOne();
        imlpRunnableTwo sdfgdsf = new imlpRunnableTwo();

        threadOne.start();
        threadTwo.start();

        asdfasf.run();
        sdfgdsf.start();





    }
}
