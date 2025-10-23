package task1;

//Bill Payment Class to represent bill payments (Queue ADT)
import java.util.LinkedList;
import java.util.Queue;

class BillPayment implements Bank {
     private Queue<String> billQueue = new LinkedList<>();

 public void addBillPayment(String billDetails) {
     billQueue.offer(billDetails);
 }

 public String removeBillPayment() {
     return billQueue.isEmpty() ? null : billQueue.poll();
 }

 public String peekBillPayment() {
     return billQueue.peek();
 }

 public int size() {
     return billQueue.size();
 }

 @Override
 public void performOperation() {
     System.out.println("Bill Payment Operation:");
     if (!billQueue.isEmpty()) {
         System.out.println("Processing Bill Payment: " + billQueue.peek());
     } else {
         System.out.println("No bills to process.");
     }
 }
}