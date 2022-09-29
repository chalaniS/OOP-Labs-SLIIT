package Lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

public class Ex4 {

    public static void main(String args[]) throws IOException {

        double height, width, length, volume;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))

        System.out.print("Enter Length Value : ");
        length = Double.parseDouble(reader.readLine());

        System.out.print("Enter width Value : ");
        width = Double.parseDouble(reader.readLine());

        System.out.print("Enter height Value : ");
        height = Double.parseDouble(reader.readLine());

        volume = length * width * height;
        System.out.println("Volume of a cube is : " + volume);

    }
}