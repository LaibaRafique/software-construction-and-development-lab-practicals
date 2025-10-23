package Task1;

import java.util.Scanner;

public class MarkSheet {
    private String studentName;
    private int totalMarks;
    private int obtainedMarks;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        totalMarks = scanner.nextInt();
        System.out.print("Enter Obtained Marks: ");
        obtainedMarks = scanner.nextInt();
        scanner.close();
    }

    public double calculatePercentage() {
        return (obtainedMarks / (double) totalMarks) * 100;
    }

    public char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else return 'F';
    }

    public double calculateGPA() {
        char grade = calculateGrade();
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            default: return 0.0;
        }
    }

    public void displayResults() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.println("Grade: " + calculateGrade());
        System.out.printf("GPA: %.2f\n", calculateGPA());
    }

    public static void main(String[] args) {
        MarkSheet markSheet = new MarkSheet();
        markSheet.inputDetails();
        markSheet.displayResults();
    }
}


