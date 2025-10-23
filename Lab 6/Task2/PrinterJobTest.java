package Task2;

public class PrinterJobTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        PrintJob printJob = new PrintJob(printer, 15);

        RefillJob refillJob = new RefillJob(printer, 10);

        printJob.start();
        refillJob.start();
    }
}

