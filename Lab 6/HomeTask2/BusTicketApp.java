package HomeTask2;

class BusTicketApp extends Thread {
    static Synch b;
    int seats;

    public void run() {
        b.busTicket(seats); 
    }

    public static void main(String args[]) {
        b = new Synch();

        BusTicketApp t1 = new BusTicketApp();
        t1.seats = 7;
        t1.start();

        BusTicketApp t2 = new BusTicketApp();
        t2.seats = 7;
        t2.start();
    }
}