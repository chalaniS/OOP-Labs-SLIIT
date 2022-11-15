package Lab9.Ex2;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("Singleton Invocation");

        }

        return singleton;
    }

}
