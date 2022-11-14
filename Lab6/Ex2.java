package Lab6;

import java.util.*;

class Student {
    private int StudentID;
    private double gpa;
    private String name;

    // constructor
    Student(int StudentID, double gpa, String name) {
        this.StudentID = StudentID;
        this.gpa = gpa;
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class Ex2 {
    public static void main(String[] args) {

        List<Student> Studentlist = new ArrayList<>();

        Studentlist.add(new Student(100, 2.5, "Kamal"));
        Studentlist.add(new Student(200, 3.5, "Nimal"));
        Studentlist.add(new Student(102, 2.8, "Samal"));

        // Traversing through the list (Iterative through the list)
        for (Student s : Studentlist) {
            System.out.println("Student ID : " + s.getStudentID());
            System.out.println("Student GPA : " + s.getGpa());
            System.out.println("Student Name : " + s.getName());
            System.out.println();
        }

    }
}
