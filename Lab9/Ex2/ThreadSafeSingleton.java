package Lab9.Ex2;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        synchronized (threadSafeSingleton) {
            if (threadSafeSingleton == null) {
                threadSafeSingleton = new ThreadSafeSingleton();
                System.out.println("ThreadSafeSingleton Invocation");

            }

        }
        return threadSafeSingleton;
    }

}
