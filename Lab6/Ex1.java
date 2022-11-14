package Lab6;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        listGenericTotal(addElementGenericArray());
    }

    // Add the elemnts to the Array List
    public static List<Integer> addElementGenericArray() {

        // ArrayList Object
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        if (list.isEmpty() == true) {
            System.out.println("List is empty..");
        }

        System.out.println("Please enter values for list ... ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Value  " + (i + 1) + " : ");
            list.add(sc.nextInt());
        }

        return list;
    }

    // getting the total
    public static void listGenericTotal(List<Integer> list) {
        int total = 0;
        int i = 0;

        for (Integer x : list) {
            total += x;
            System.out.println("Value  " + (i + 1) + " : " + x);
            i++;
        }

        System.out.println("Total is : " + total);
    }

}