package Task3;

public class Customer {
	 private String customerId;
	 private String name;
	 private String address;
	 private int phoneNo;
	 private int age;

	 public Customer(String customerId, String name, String address, int phoneNo, int age) {
	     this.customerId = customerId;
	     this.name = name;
	     this.address = address;
	     this.phoneNo = phoneNo;
	     this.age = age;
	 }

	 public void addDetails() {
	     System.out.println("Adding customer details for " + name);
	 }

	 public void modifyDetails() {
	     System.out.println("Modifying customer details for " + name);
	 }
	}

