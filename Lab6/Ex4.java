package Lab6;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {

        // creating a map of student
        Map<Integer, Student> map = new HashMap<Integer, Student>();

        // creating Students
        Student s1 = new Student(100, 2.5, "Kamal");
        Student s2 = new Student(200, 3.5, "Nimal");
        Student s3 = new Student(102, 2.8, "Samal");

        // Adding studentys to map
        map.put(s1.getStudentID(), s1);
        map.put(s2.getStudentID(), s2);
        map.put(s3.getStudentID(), s3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student ID : ");
        int id = sc.nextInt();

        // pass key values to get that object's other data and
        // assigning data to another object

        Student st = map.get(id);

        // print methord to print data
        System.out.println("Student ID : " + st.getStudentID());
        System.out.println("Student GPA : " + st.getGpa());
        System.out.println("Student Name : " + st.getName());

        // print all the values using map(optional)
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {

            int key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("All data in map");
            System.out.println("Student ID : " + value.getStudentID());
            System.out.println("Student GPA : " + value.getGpa());
            System.out.println("Student Name : " + value.getName());

        }

    }

}
