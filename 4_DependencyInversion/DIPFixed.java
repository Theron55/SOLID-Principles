package DIP;

public class DIPFixed {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // Inject dependency via abstraction
        App app = new App(db);
        app.store("User data");
    }
}

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving '" + data + "' to MySQL database.");
    }
}

class App {
    private Database db;

    public App(Database db) {
        this.db = db;
    }

    public void store(String data) {
        db.save(data);
    }
}

