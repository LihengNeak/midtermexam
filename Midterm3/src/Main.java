class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Creating a square (inheriting from Rectangle)
        Square square = new Square(4.0);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
