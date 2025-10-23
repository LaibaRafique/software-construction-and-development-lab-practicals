package HomeTask1;

class Synch {
    int total_seats = 10;

    // Synchronized method
    synchronized void busTicket(int seats) {
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

