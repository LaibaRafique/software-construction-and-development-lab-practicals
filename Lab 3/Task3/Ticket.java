package Task3;

public class Ticket {
	 private String source;
	 private String destination;
	 private String dateOfJourney;
	 private String time;
	 private String busNo;
	 private String seatNo;

	 public Ticket(String source, String destination, String 
			 dateOfJourney, String time, String busNo, String seatNo) {
	     this.source = source;
	     this.destination = destination;
	     this.dateOfJourney = dateOfJourney;
	     this.time = time;
	     this.busNo = busNo;
	     this.seatNo = seatNo;
	 }

	 public void displayTicketInfo() {
	     System.out.println("Ticket Information:");
	     System.out.println("Source: " + source);
	     System.out.println("Destination: " + destination);
	     System.out.println("Date of Journey: " + dateOfJourney);
	     System.out.println("Time: " + time);
	     System.out.println("Bus No: " + busNo);
	     System.out.println("Seat No: " + seatNo);
	 }
	}

