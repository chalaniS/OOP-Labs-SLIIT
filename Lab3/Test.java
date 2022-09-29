package Lab3;

class Person {

    public void showDetails() {

        System.out.println("Name : Address : ");

    }

}

class Student extends Person {
    protected String name;
    private String ditno;
    protected String address;

    public Student() {
    }

    public Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void display() {
        System.out.println("Name : " + name + "\nDipartment Number : " + ditno + "\nAddress : " + address + "\n");
    }

    public String getName() {
        return name;
    }

    public String getDitno() {
        return ditno;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDitno(String ditno) {
        this.ditno = ditno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        String s = "I am a Student. \nMy name is " + name + ".\nI am from " + address + ". \nMy dit no is " + ditno
                + ".\n";
        return s;
    }

}

class PartTimeStudent extends Student {

    public PartTimeStudent(String name, String ditno, String address) {
        super(name, ditno, address);
    }

    public PartTimeStudent() {
    }

    private String noHours;

}

class InheritanceDemo {

}

public class Test {

    static public void main(String args[]) {

        // Ex1
        // Student s1 = new Student("Chalani", "IT/89655", "Colombo");
        // Student s2 = new Student("Saumya", "BM/35411", "Malabe");

        // s1.display();
        // s2.display();

        // Ex3
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Chalani");
        s1.setDitno("IT/87946");
        s1.setAddress("Malabe");

        s2.setName("Saumya");
        s2.setDitno("BM/12354");
        s2.setAddress("Colombo");

        // System.out.println("Name : " + s1.getName() +
        // "\nDipartment Number : " + s1.getDitno() +
        // "\nAdderss : " + s1.getAddress());

        // System.out.println("\nName : " + s2.getName() +
        // "\nDipartment Number : " + s2.getDitno() +
        // "\nAdderss : " + s2.getAddress());

        // Ex4
        // System.out.println(s1.getDetails());
        // System.out.println(s2.getDetails());

        // ex5 -6 -7- 8
        Person p = new Person();
        Student s = new Student();
        PartTimeStudent ps = new PartTimeStudent();

        ps.showDetails();

    }

}
