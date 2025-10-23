package task1;

//Immutable Class for Failed Students
final class FailedStudent {
 private final String rollNumber;
 private final String subjectCode;
 private final String subjectName;

 public FailedStudent(String rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 // Getter methods to retrieve values
 public String getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }
}

