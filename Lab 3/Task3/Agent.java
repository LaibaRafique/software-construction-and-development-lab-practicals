package Task3;

public class Agent implements CommonFunctions {
	 private int id;
	 private String name;

	 public Agent(int id, String name) {
	     this.id = id;
	     this.name = name;
	 }

	 @Override
	 public void searchTicket() {
	     System.out.println("Agent " + name + " is searching for a ticket.");
	 }

	 @Override
	 public void bookTicket() {
	     System.out.println("Agent " + name + " is booking a ticket.");
	 }

	 @Override
	 public void cancelTicket() {
	     System.out.println("Agent " + name + " is cancelling a ticket.");
	 }

	 @Override
	 public void makePayment() {
	     System.out.println("Agent " + name + " is making a payment.");
	 }

	 @Override
	 public void fillDetails() {
	     System.out.println("Agent " + name + " is filling details.");
	 }
	}

