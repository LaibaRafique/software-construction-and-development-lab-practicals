package task1;

//Loan Class to represent loan takers (Stack ADT)
class Loan {
     private String loanNumber;
     private String loanTakerName;
     private double loanAmount; 

 public Loan(String loanNumber, String loanTakerName, double loanAmount) {
     this.loanNumber = loanNumber;
     this.loanTakerName = loanTakerName;
     this.loanAmount = loanAmount;
 }

 public String getLoanNumber() {
     return loanNumber;
 }

 public String getLoanTakerName() {
     return loanTakerName;
 }

 public double getLoanAmount() {
     return loanAmount;
 }
}

