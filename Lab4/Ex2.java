package Lab4;

class Feet {
    private int feet;
    private int inches;

    public Feet(Feet len) {
        Feet f = len;
    }

    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2) {
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;
    }

    public static Feet add(Feet f1, Feet f2, Feet f3) {
        Feet f = new Feet(0, 0);
        f.feet = f1.feet + f2.feet + f3.feet;
        f.inches = f1.inches + f2.inches + f3.inches;
        return f;
    }

    public void add(Feet f1) {
        this.feet += f1.feet;
        this.inches += f1.inches;
    }

    // Display a Length e.g 5’6”
    public void print(Feet f) {

        System.out.println(f.feet + "' " + f.inches + "'");

    }

    public void print(String msg) {

        System.out.println(msg + " : " + feet + "' " + inches + "'");

    }

}

class Ex2 {
    static public void main(String args[]) {
        // Feet f1 = new Feet(10, 2);
        // Feet f2 = new Feet(20, 4);

        // f1.add(f1, f2);

        // f1.print("Length");

        Feet f1 = new Feet(10, 5);
        Feet f2 = new Feet(10, 5);
        Feet f3 = new Feet(10, 5);

        Feet f5 = Feet.add(f1, f2, f3);

        f1.print(f5);

    }

}