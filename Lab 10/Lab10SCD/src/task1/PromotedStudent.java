package task1;

//Mutable Class for Promoted Students
class PromotedStudent {
 private String rollNumber;
 private String subjectCode;
 private String subjectName;

 public PromotedStudent(String rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 // Getter methods
 public String getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 // Setter methods to modify values (mutability)
 public void setRollNumber(String rollNumber) {
     this.rollNumber = rollNumber;
 }

 public void setSubjectCode(String subjectCode) {
     this.subjectCode = subjectCode;
 }

 public void setSubjectName(String subjectName) {
     this.subjectName = subjectName;
 }
}

