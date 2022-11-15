package Lab8.Ex2;

public class Deadlock {
    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread1 threadone = new Thread1(lock1, lock2);
        Thread2 threadtwo = new Thread2(lock1, lock2);

        threadone.start();
        threadtwo.start();
    }

}

class Thread1 extends Thread {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public Thread1(Object lock1, Object lock2) {
        super();
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        System.out.println("Started Executing Thread 1..");

        synchronized (lock1) {
            System.out.println("Thread 1 holding lock 1.....");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("Thread 1 is awaiting for the lock 2...");

        }
        synchronized (lock2) {
            System.out.println("Thread 2 is holding lock 1 & lock 2");
        }
    }

}

class Thread2 extends Thread {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public Thread2(Object lock1, Object lock2) {
        super();
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        System.out.println("Started Executing Thread 2..");

        synchronized (lock2) {
            System.out.println("Thread 2 holding lock 2.....");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("Thread 2 is awaiting for the lock 1...");

            synchronized (lock1) {
                System.out.println("Thread 2 is holding lock 1 & lock 2");
            }

        }

    }

}