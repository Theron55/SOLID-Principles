package LSP;

public class LSPFixed {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        makeBirdFly(sparrow);  // ✅ Works fine

        Bird ostrich = new Ostrich();
        describeBird(ostrich); // ✅ No flying assumed
    }

    public static void makeBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public static void describeBird(Bird bird) {
        System.out.println("This is a bird.");
    }
}

interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Ostrich implements Bird {
    // Ostrich doesn't fly — and that's okay!
}

