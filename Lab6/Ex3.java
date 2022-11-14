package Lab6;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        // setdemonstration using hashSet constructor
        Set studentHeight = new HashSet();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height " + (i + 1) + " : ");
            studentHeight.add(sc.nextInt());
        }

        int i = 0;

        // Loop through a HashSet
        // Iterating the set elements using for each loop
        for (Object h : studentHeight) {

            System.out.println("Height " + (i + 1) + " : " + h);
            i++;
        }

    }

}
