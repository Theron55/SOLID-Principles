package SRP;

public class SRPFixed {
    public static void main(String[] args) {
        Report report = new Report("This is a test report.");
        ReportPrinter printer = new ReportPrinter();
        ReportSaver saver = new ReportSaver();

        printer.print(report);
        saver.saveToFile(report, "report.txt");
    }
}

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class ReportPrinter {
    public void print(Report report) {
        System.out.println("Printing report: " + report.getContent());
    }
}

class ReportSaver {
    public void saveToFile(Report report, String filename) {
        System.out.println("Saving report to file: " + filename);
        // Imagine file-saving logic here
    }
}

