public class OCPViolation {
    public static void main(String[] args) {
        Shape circle = new Shape("circle", 5);
        Shape square = new Shape("square", 4);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Square area: " + calculator.calculateArea(square));
    }
}

class Shape {
    public String type;
    public double value; // radius for circle, side for square

    public Shape(String type, double value) {
        this.type = type;
        this.value = value;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape.type.equals("circle")) {
            return Math.PI * shape.value * shape.value;
        } else if (shape.type.equals("square")) {
            return shape.value * shape.value;
        } else {
            return 0;
        }
    }
}
