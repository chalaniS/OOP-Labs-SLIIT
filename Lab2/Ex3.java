package Lab2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String args[]) {

        double height, width, length, volume;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length Value : ");
        length = sc.nextDouble();

        System.out.print("Enter width Value : ");
        width = sc.nextDouble();

        System.out.print("Enter height Value : ");
        height = sc.nextDouble();

        volume = length * width * height;
        System.out.println("Volume of a cube is : " + volume);

    }
}
