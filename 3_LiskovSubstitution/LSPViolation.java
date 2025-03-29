public class LSPViolation {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        makeBirdFly(bird);
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}

class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
