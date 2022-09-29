package Lab5;

// Interface Lab Sheet
interface ICompute {

    void calculate();

    void display();
}

class Person implements ICompute {
    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;

    public Person() {
    }

    public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
        this.name = name;
        this.basicSal = basicSal;
        this.otRate = otRate;
        this.otHrs = otHrs;
        this.netSal = netSal;
    }

    public void calculate() {
        netSal = basicSal + (otHrs * otRate);
    }

    public void display() {
        System.out.println("Net salary = " + netSal);
    }
}

class Box implements ICompute {
    private int length, width, height;
    private int volume;

    public Box() {
    }

    public Box(int length, int width, int height, int volume) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = volume;
    }

    public void calculate() {
        volume = length * height * width;
    }

    public void display() {
        System.out.println("Valume = " + volume);
    }
}

class Main {
    public static void main(String[] args) {
        ICompute ob1 = new Person("Danushka", 40000, 1000, 5, 0);
        ob1.calculate();
        ob1.display();

        ICompute ob2 = new Box(10, 20, 30, 0);
        ob2.calculate();
        ob2.display();
    }
}