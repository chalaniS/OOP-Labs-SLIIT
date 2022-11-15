package Lab9.Ex3;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle class");

        for (int i = 0; i < 10; i++) {
            System.out.print(" # ");
        }

        System.out.println();

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 8)
                    System.out.print(" # ");
                System.out.print("   ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(" # ");
        }
        System.out.println();

    }

}
