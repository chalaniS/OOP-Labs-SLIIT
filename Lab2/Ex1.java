package Lab2;

public class Ex1 {

    public static void main(String args[]) {

        int miles = 26, yards = 385;
        double kilometers;

        kilometers = (miles * 1.609) + (yards * 1.609 / 1760);

        System.out.println("Kilometer value : " + kilometers);
    }
}