//Ex1

package Lab4;

class Student {
    static int studentID = 000;
    String name;
    String degree;
    String mobile;

    public Student(String name, String degree, String mobile) {
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void print() {
        System.out.println("Name : " + name + "\nDegree : " + degree + "\nMobile : " + mobile);
    }

    static public int getNextStudentID() {
        return studentID + 1;
    }

}

class StudentApp {

    public static void main(String[] args) {

        Student[] s = new Student[5];
        s[0] = new Student("chalani", "IT", "953623");
        s[1] = new Student("janny", "BM", "5856");
        s[2] = new Student("Kathgy", "CN", "5242");
        s[3] = new Student("loli", "SE", "1563");
        s[4] = new Student("kasu", "DS", "87687");

        // s[0].setName("Chalani");
        // s[0].setDegree("IT");
        // s[0].setMobile("01111111");

        // s[1].setName("Chalani");
        // s[1].setDegree("IT");
        // s[1].setMobile("01111111");

        // s[2].setName("Chalani");
        // s[2].setDegree("IT");
        // s[2].setMobile("01111111");

        // s[3].setName("Chalani");
        // s[3].setDegree("IT");
        // s[3].setMobile("01111111");

        // s[4].setName("Chalani");
        // s[4].setDegree("IT");
        // s[4].setMobile("01111111");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nName : " + s[i].getName());
            System.out.println("Degree : " + s[i].getDegree());
            System.out.println("Mobile : " + s[i].getMobile());
        }

    }

}
