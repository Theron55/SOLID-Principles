package SRP;

public class SRPViolation {
    public static void main(String[] args) {
        Report report = new Report("This is a test report.");
        report.printReport();
        report.saveToFile("report.txt");
    }
}

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public void printReport() {
        System.out.println("Printing report: " + content);
    }

    public void saveToFile(String filename) {
        System.out.println("Saving report to file: " + filename);
    }
}
