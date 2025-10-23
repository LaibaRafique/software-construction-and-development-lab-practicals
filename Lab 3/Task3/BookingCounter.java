package Task3;

public class BookingCounter {
 public void processBooking(Agent agent, Ticket ticket) {
     System.out.println("Processing booking at the counter.");
     agent.bookTicket();
     ticket.displayTicketInfo();
 }
}

