package Lab9.Ex2;

public class TestThreadSingleton implements Runnable {

    /**
     * @param args
     */
    public static void main(String[] args) {

        new Thread(new TestThreadSingleton()).start();

        for (int i = 0; i < 10; i++) {
            Singleton.getInstance();
            ThreadSafeSingleton.getInstance();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Singleton.getInstance();
            ThreadSafeSingleton.getInstance();
        }
    }

}
