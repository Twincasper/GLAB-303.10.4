public class Rectangle extends Shape implements Movable {
    protected double width;
    protected double height;
    private int x, y;

    public Rectangle(double width, double height, int x, int y) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public void displayShapeName() {
        System.out.println("Drawing a rectangle of width: " + width + " and height: " + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
