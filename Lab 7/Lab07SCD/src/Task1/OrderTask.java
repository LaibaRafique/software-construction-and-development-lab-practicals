package Task1;

class OrderTask implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " starting order.");

            if (OrderProcessingSystem.checkInventory()) {
                if (OrderProcessingSystem.processPayment()) {
                    OrderProcessingSystem.shipProduct();
                }
            }

            Thread.sleep(500);  
            System.out.println(Thread.currentThread().getName() + " completed order.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}
