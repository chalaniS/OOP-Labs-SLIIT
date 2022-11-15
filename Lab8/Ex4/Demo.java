package Lab8.Ex4;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Map<String, Integer> number = new HashMap<>();

        T1 threadone = new T1(number);
        T2 threadtwo = new T2(number);

        threadone.start();
        threadtwo.start();

    }

}

class T1 extends Thread {

    // Map method
    Map<String, Integer> number1;

    Scanner sc = new Scanner(System.in);

    // constructor
    public T1(Map<String, Integer> number1) {
        super();
        this.number1 = number1;
    }

    @Override
    public void run() {
        synchronized (number1) {
            for (int j = 0; j >= 0; j++) {
                System.out.println("Thread 01 started");

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Please enter no1 and no2 as keyboard input 3 times.");

                    System.out.print("Enter no1 : ");
                    String no1 = sc.next();

                    System.out.print("Enter no2 : ");
                    int no2 = sc.nextInt();

                    number1.put(no1, no2);

                }

                try {
                    System.out.println("thread 01 goes to waiting state");
                    System.out.println();
                    number1.wait();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

        }

    }
}

class T2 extends Thread {

    // Map method
    Map<String, Integer> number1;

    public T2(Map<String, Integer> number1) {
        this.number1 = number1;
    }

    @Override
    public void run() {
        synchronized (number1) {

            System.out.println("Thread 02 started..");
            System.out.println("You entered no1 * no2 = result output");

            for (Map.Entry<String, Integer> entry : number1.entrySet()) {

                Integer k = Integer.parseInt(entry.getKey());

                // print key
                System.out.println(k + " * " + entry.getValue() + " = " + k * entry.getValue());

            }
            System.out.println("Thread 01 notified..");
            System.out.println();
            number1.notify();

        }

    }

}