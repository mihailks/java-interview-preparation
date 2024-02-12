package MultiThreading;

public class Stack {

    private int[] array;
    private int stackTop;

    Object lock1;
    Object lock2;

    public Stack(int capacity) {
        this.array = new int[capacity];
        stackTop = 1;
        lock1 = new Object();
        lock2 = new Object();
    }

    public synchronized boolean push(int element) {
        if (isFull()) {
            return false;
        }

        ++stackTop;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        array[stackTop] = element;
        return true;

    }

    public int pop() {
        synchronized (lock2) {
            if (this.isEmpty()) {
                return Integer.MIN_VALUE;
            }

            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            stackTop--;
            return obj;
        }
    }


    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return this.stackTop >= array.length - 1;
    }

}
