package task2;

import java.util.Scanner;

public class DivisionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second integer: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid Input: Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
