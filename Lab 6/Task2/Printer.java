package Task2;

class Printer {
    private int availablePages = 10;

    public synchronized void printPages(int pages) {
        while (availablePages < pages) {
            System.out.println("Not enough pages to print " + pages + ". Waiting for refill...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        availablePages -= pages;
        System.out.println("Printed " + pages + " pages. Remaining pages: " + availablePages);
    }

    public synchronized void refillPages(int pages) {
        availablePages += pages;
        System.out.println("Refilled " + pages + " pages. Total available pages: " + availablePages);
        notifyAll();
    }
}

