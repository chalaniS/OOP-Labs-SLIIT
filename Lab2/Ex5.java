package Lab2;

import java.util.Scanner;

class EvenOddNumber {

    public static boolean findEvenOrOdd(int i) {

        if (i % 2 == 0)
            return true;
        else
            return false;

    }
}

public class Ex5 {
    public static void main(String args[]) {

        EvenOddNumber num = new EvenOddNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int var = sc.nextInt();

        boolean result = EvenOddNumber.findEvenOrOdd(var);

        if (result)
            System.out.println(var + " is Even number");
        else
            System.out.println(var + " is Odd number");

    }
}
