package Lab3;

class Pet {
    protected String name;
    protected String owner;
    protected int age;

    public Pet(String n, String o, int a) {
        this.name = n;
        this.owner = o;
        this.age = a;
    }

    public Pet(String n, String o) {
        this.name = n;
        this.owner = o;

    }

    public void showDetails() {
        System.out.println("I am a pet. My name is "
                + this.name + ". My owner is " + this.owner);
    }
}// end of the pet class

class Cat extends Pet {
    private int livesLeft;

    public Cat(String n, String o, int a, int l) {
        super(n, o, a);
        this.livesLeft = l;
    }

    public Cat(String n, String o) {
        super(n, o);

    }

    public void showDetails() {
        super.showDetails();
        System.out.println("I am a cat. " +
                this.livesLeft + " lives remain for me.");
    }
}// end of the pet class

class Dog extends Pet {

    Dog(String n, String o) {
        super(n, o);

    }

    Dog(String n, String o, int a, int m) {

        super(n, o, m);
    }

    int noOfMasters;

    public void showDetails() {
        System.out.println("I am a pet. My name is " + name + " My owner is " + owner + " I am a dog. I have "
                + noOfMasters + " masters at home");

    }
}

public class animal {
    public static void main(String[] args) {
        Pet p = new Pet("Lissie", "Smith", 3);
        p.showDetails();

        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();

        Pet newbornPet = new Pet("Doggy", "John");
        newbornPet.showDetails();

        Cat newbornCat = new Cat("Kitty", "Janny");
        newbornCat.showDetails();

        Dog newbornDog1 = new Dog("Boww", "Kathy");
        newbornDog1.showDetails();

        Dog newbornDog2 = new Dog("Booly", "Silva", 3, 1);
        newbornDog2.showDetails();

        Pet p3 = c;
        p3.showDetails();

    }
}// end of the demo class
