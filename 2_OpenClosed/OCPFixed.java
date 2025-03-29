public class OCPFixed {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Square area: " + calculator.calculateArea(square));
    }
}

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
