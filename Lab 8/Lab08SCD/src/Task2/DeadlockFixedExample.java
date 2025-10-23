package Task2;

class DeadlockFixedExample {
	    private static final Object lock1 = new Object();
	    private static final Object lock2 = new Object();
	    private static final Object lock3 = new Object();

	    static class Thread1 extends Thread {
	        public void run() {
	            synchronized (lock1) {
	                System.out.println("Thread 1 acquired lock1");
	                try { Thread.sleep(100); } catch (InterruptedException e) {}
	                synchronized (lock2) {
	                    System.out.println("Thread 1 acquired lock2");
	                    try { Thread.sleep(100); } catch (InterruptedException e) {}
	                    synchronized (lock3) {
	                        System.out.println("Thread 1 acquired lock3");
	                    }
	                }
	            }
	            System.out.println("Thread 1 released all locks");
	        }
	    }

	    static class Thread2 extends Thread {
	        public void run() {
	            synchronized (lock1) { 
	                System.out.println("Thread 2 acquired lock1");
	                try { Thread.sleep(100); } catch (InterruptedException e) {}
	                synchronized (lock2) {
	                    System.out.println("Thread 2 acquired lock2");
	                    try { Thread.sleep(100); } catch (InterruptedException e) {}
	                    synchronized (lock3) {
	                        System.out.println("Thread 2 acquired lock3");
	                    }
	                }
	            }
	            System.out.println("Thread 2 released all locks");
	        }
	    }

	    static class Thread3 extends Thread {
	        public void run() {
	            synchronized (lock1) { 
	                System.out.println("Thread 3 acquired lock1");
	                try { Thread.sleep(100); } catch (InterruptedException e) {}
	                synchronized (lock2) {
	                    System.out.println("Thread 3 acquired lock2");
	                    try { Thread.sleep(100); } catch (InterruptedException e) {}
	                    synchronized (lock3) {
	                        System.out.println("Thread 3 acquired lock3");
	                    }
	                }
	            }
	            System.out.println("Thread 3 released all locks");
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread1();
	        Thread t2 = new Thread2();
	        Thread t3 = new Thread3();

	        t1.start();
	        t1.join(); 

	        t2.start();
	        t2.join(); 

	        t3.start();
	        t3.join(); 
	    }
	}


