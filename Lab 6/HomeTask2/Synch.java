package HomeTask2;

class Synch {
    int total_seats = 10;

    void busTicket(int seats) {
        // Synchronized block
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " Seats booked successfully");
                total_seats = total_seats - seats;
                System.out.println("Seats left: " + total_seats);
            } else {
                System.out.println("Sorry, seats cannot be booked....!!");
                System.out.println("Seats left: " + total_seats);
            }
        }
    }
}

