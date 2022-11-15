package Lab9.Ex3;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square class");

        for (int i = 0; i < 5; i++) {
            System.out.print(" # ");
        }

        System.out.println();

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 5; i++) {
                if (i == 0 || i == 3)
                    System.out.print(" # ");
                System.out.print("   ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(" # ");
        }
        System.out.println();

    }

}
