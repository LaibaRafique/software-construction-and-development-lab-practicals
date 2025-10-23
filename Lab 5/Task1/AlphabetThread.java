package Task1;

import java.util.Random;

public class AlphabetThread extends Thread {
    private volatile boolean running = true; 

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 26 && running; i++) { 
            try {              
                long delay = 200 + random.nextInt(800);
                Thread.sleep(delay);
                
                char randomChar = (char) ('A' + random.nextInt(26));
                System.out.println(Thread.currentThread().getName() + ": " + randomChar);

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " has stopped.");
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) {
        AlphabetThread t1 = new AlphabetThread();
        AlphabetThread t2 = new AlphabetThread();
        AlphabetThread t3 = new AlphabetThread();

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000); 
            t3.stopThread(); 
            System.out.println("Thread t3 is stopped using the custom stopThread() method.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
