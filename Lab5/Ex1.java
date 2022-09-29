package Lab5;

abstract class Animal {
    private String name;

    public Animal() {
        System.out.println("Animal constructor called");
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract public String speak();

    public void display() {
        System.out.println("My name is " + this.name + ". " + this.speak() + ".");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog constructor called");
    }

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Bow Wow";
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Cat constructor called");
    }

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "Meow Meow";
    }
}

class ToyCat extends Cat {
    String manufacturer;

    public ToyCat() {
        System.out.println("ToyCat constructor called");
    }

    public ToyCat(String name, String manufacturer) {
        super(name);
        this.manufacturer = manufacturer;
    }

    public void display() {
        super.display();
        System.out.println("I am from " + manufacturer + ".");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("test");
        animal1.display();

        Cat mycat = new Cat("Micky");
        mycat.display();

        Dog mydog = new Dog("Rover");
        mydog.display();

        ToyCat mytoy = new ToyCat("kittie", "Toysrus");
        mytoy.display();

        // b
        Dog d = new Dog();
        Cat c = new Cat();
        ToyCat tc = new ToyCat();

        // `Output of Question b
        // Animal constructor called
        // Dog constructor called
        // Animal constructor called
        // Cat constructor called
        // Animal constructor called
        // Cat constructor called
        // ToyCat constructor called

    }
}
