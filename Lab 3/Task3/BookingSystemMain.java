package Task3;

public class BookingSystemMain {
	 public static void main(String[] args) {
	     Customer customer = new Customer("C001", "Laiba Rafiq", "123 Main St", 1234567890, 25);
	     customer.addDetails();
	     
	     Agent agent = new Agent(101, "Agent Smith");
	     
	     Ticket ticket = new Ticket("Karachi", "Lahore", "2024-11-10", "10:00 AM", "B001", "S12");
	     
	     BookingCounter bookingCounter = new BookingCounter();
	     bookingCounter.processBooking(agent, ticket);
	     
	     Refund refund = new Refund(20000.0f, "C001");
	     refund.refundAmount();
	 }
	}

