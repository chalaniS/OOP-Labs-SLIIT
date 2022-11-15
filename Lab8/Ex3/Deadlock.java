package Lab8.Ex3;

public class Deadlock {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

        ThreadOne threadone = new ThreadOne(lock1, lock2);
        ThreadTwo threadtwo = new ThreadTwo(lock1, lock2);

        threadone.start();
        threadtwo.start();
    }
}
