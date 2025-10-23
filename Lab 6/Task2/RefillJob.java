package Task2;

class RefillJob extends Thread {
    private Printer printer;
    private int pages;

    public RefillJob(Printer printer, int pages) {
        this.printer = printer;
        this.pages = pages;
    }

    public void run() {
        printer.refillPages(pages);
    }
}

