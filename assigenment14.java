package demo;

// Abstract class
abstract class Shape {
    int a, b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Rectangle area: " + area);
    }
}

// Circle class
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // b is unused
    }

    @Override
    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Circle area: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Triangle area: " + area);
    }
}

// Main class to test
public class Shape {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(8, 6);
        Shape circ = new Circle(7);

        rect.printArea();
        tri.printArea();
        circ.printArea();
    }
}
