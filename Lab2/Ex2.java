package Lab2;

//run as bellow
//C:\>java Ex2 Anoja IT14129011 Kalutara

public class Ex2 {

    public static void main(String args[]) {

        System.out.println("Dit No : " + args[0]);
        System.out.println("Name: " + args[1]);
        System.out.println("District " + args[2]);

        String num = args[3];
        System.out.println("Module : " + num);

        int num1 = Integer.parseInt(args[4]);
        System.out.println("Code: " + num1);
    }
}
