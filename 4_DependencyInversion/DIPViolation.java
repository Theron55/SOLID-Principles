public class DIPViolation {
    public static void main(String[] args) {
        App app = new App();
        app.store("User data");
    }
}

class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving '" + data + "' to MySQL database.");
    }
}

class App {
    private MySQLDatabase db = new MySQLDatabase(); // Direct dependency on concrete class

    public void store(String data) {
        db.save(data);
    }
}
