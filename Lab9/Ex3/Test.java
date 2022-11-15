package Lab9.Ex3;

public class Test {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("Circle");

        // call draw method of Circle
        shape1.draw();

        // get an object of SQUARE and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");

        // call draw method of SQUARE
        shape2.draw();

        // get an object of SQUARE and call its draw method.
        Shape shape3 = shapeFactory.getShape("Triangle");

        // call draw method of SQUARE
        shape3.draw();

    }

}
