package Task2;

class TableThread extends Thread {
    private int number;
    private String identifier;

    public TableThread(int number, String identifier) {
        this.number = number;
        this.identifier = identifier;
    }

    public void run() {
        System.out.println("Table for " + identifier + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Roll Number: 2022-SE-064");
        System.out.println("Date of Birth: 22-March");
        
        TableThread actualRollNumberTable = new TableThread(64, "Actual Roll Number: 64");

        TableThread dobTable = new TableThread(22, "Date of Birth: 22");

        actualRollNumberTable.start();
        dobTable.start();
    }
}

