package Lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

// Lab Sheet on Try Catch Blocks
class Ex3 {
    public static void main(String[] args) {
        int maxSubjects;
        int[] marks = new int[5];
        int total = 0;
        double avg;
        Scanner s = new Scanner(System.in);

        try {
            // 1. Input a value for maxSubjects
            // from keyboard

            System.out.print("Enter value : ");
            maxSubjects = s.nextInt();

            // 2. Using a for loop
            // input marks

            for (int i = 0; i < maxSubjects; i++) {
                System.out.print("Enter Mark " + (i + 1) + " : ");
                marks[i] = s.nextInt();
                total += marks[i];
            }

            // 3. Calculate the avg marks

            avg = (double) total / (double) maxSubjects;

            // 4. Use a try catch block to
            // prevent the following
            // run time errors
            // (a) Input valid integers to the
            // inputs
            // (b) ArithmeticException division
            // by zero
            // (c) ArrayIndexOutOfBounds
            // Exception

        } catch (InputMismatchException e) {
            System.out.println("Input invalid...  ");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException error.. avarage may be 0/0 ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length is not enough... maxSubjects should be <=4");
        } finally {
            System.out.println("This code will be gurrentied to run");
        }

        System.out.println("The end");
    }
}