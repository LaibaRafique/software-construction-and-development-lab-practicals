package task1;

public class StudentDemo {
    public static void main(String[] args) {
        // Immutable student (Failed)
        FailedStudent failedStudent = new FailedStudent("001", "CS101", "Programming Basics");
        System.out.println("Failed Student Details:");
        System.out.println("Roll Number: " + failedStudent.getRollNumber());
        System.out.println("Subject Code: " + failedStudent.getSubjectCode());
        System.out.println("Subject Name: " + failedStudent.getSubjectName());

        // Mutable student (Promoted)
        PromotedStudent promotedStudent = new PromotedStudent("002", "CS102", "Data Structures");
        System.out.println("\nPromoted Student Details:");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());

        // Modifying promoted student details
        promotedStudent.setRollNumber("003");
        promotedStudent.setSubjectCode("CS103");
        promotedStudent.setSubjectName("Algorithms");
        System.out.println("\nModified Promoted Student Details:");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());
    }
}

