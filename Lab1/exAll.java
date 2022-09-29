package Lab1;

public class exAll {

    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*\t");
            }

            System.out.println("\n");

        }

        System.out.println("\n");

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }

            System.out.println("\n");

        }

        System.out.println("\n\n");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }

            System.out.println("\n");

        }

        System.out.println("\n\n");

    }

}