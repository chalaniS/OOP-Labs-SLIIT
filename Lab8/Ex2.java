package Lab8;

public class Ex2 {

    public static void main(String[] args) {

        print("Age is : ", 23);
        print("Name is : ", "Mike");
        print("Price is :", 12.0);

    }

    public static <E> void print(String msg, E val) {
        System.out.println(msg + " " + val);
    }

}
