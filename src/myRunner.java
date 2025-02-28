public class myRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        // Rectangle testing

        System.out.println("--------Test Rectangle-------");

        Rectangle r1 = new Rectangle(4, 5, 0, 0);
        System.out.println("Area of Rectangle: " + r1.getArea());
        System.out.println("Coordinates are " + r1.getCoordinate());

        r1.moveDown();
        System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

        r1.moveRight();
        System.out.println("After move Right, Coordinates are " + r1.getCoordinate());

        r1.moveUp();
        System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

        r1.moveLeft();
        System.out.println("After move Left, Coordinates are " + r1.getCoordinate());

        System.out.println("--------Test Polymorphism-------");
        Movable r2 = new Rectangle(10, 20, 5, 5); // upcast
        r2.moveUp();
        System.out.println("After move Up, Coordinates are " + r2.getCoordinate());

        r2.moveLeft();
        System.out.println("After move Left, Coordinates are " + r2.getCoordinate());
    }
}
