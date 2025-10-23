package Task1;

class OrderProcessingSystem {

    private static int inventory = 100; 

    public synchronized static boolean checkInventory() {
        long startTime = System.currentTimeMillis(); // Track start time for inventory check
        if (inventory > 0) {
            inventory--;
            System.out.println("Inventory checked and updated. Remaining stock: " + inventory);
            return true;
        } else {
            System.out.println("Inventory not available.");
            return false;
        }
    }

    public synchronized static boolean processPayment() {
        long startTime = System.currentTimeMillis(); // Track start time for payment process
        try {
            Thread.sleep(2000); 
            System.out.println("Payment processed successfully.");
            return true;
        } catch (InterruptedException e) {
            System.out.println("Payment processing interrupted.");
            return false;
        }
    }

    public synchronized static void shipProduct() {
        long startTime = System.currentTimeMillis(); // Track start time for shipping
        try {
            Thread.sleep(1000); 
            System.out.println("Product shipped successfully.");
        } catch (InterruptedException e) {
            System.out.println("Shipping interrupted.");
        }
    }

    public static void main(String[] args) {
        Thread customer1 = new Thread(new OrderTask(), "Customer-1");
        Thread customer2 = new Thread(new OrderTask(), "Customer-2");

        customer1.start();
        customer2.start();
    }
}
