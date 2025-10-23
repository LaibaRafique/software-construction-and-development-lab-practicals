package task1;

import java.util.Scanner;
import java.util.Random;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Array elements: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\nEnter the index of the array (0-9): ");
            
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds: Please enter an index between 0 and 9.");
        } finally {
            scanner.close();
        }
    }
}
