package Task2;

class PrintJob extends Thread {
    private Printer printer;
    private int pages;

    public PrintJob(Printer printer, int pages) {
        this.printer = printer;
        this.pages = pages;
    }

    public void run() {
        printer.printPages(pages);
    }
}

