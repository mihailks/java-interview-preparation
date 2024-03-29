package MultiThreading;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main starts");

//        ThreadOne threadOne = new ThreadOne();
        Thread threadOne = new ThreadOne("FirstThreadName");

//        threadOne.setDaemon(true); // ако искаме да си я направим на daemon thread. Така няма да се изпълни или поне да си довърши всичко, понеже приключи ли main() и тя се маха
//        threadOne.start();

//        ThreadTwo threadTwo = new ThreadTwo();
//        threadTwo.run();

        Thread threadTwo = new Thread(new ThreadTwo());
        threadTwo.start();

        System.out.println("main exiting");
    }
}
