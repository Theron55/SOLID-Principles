package ISP;

public class ISPFixed {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Eatable humanEater = new HumanWorker();

        Workable robot = new RobotWorker();

        human.work();
        humanEater.eat();

        robot.work();
        // robot doesn't need to eat, and doesn't have to implement eat()
    }
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating lunch.");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

