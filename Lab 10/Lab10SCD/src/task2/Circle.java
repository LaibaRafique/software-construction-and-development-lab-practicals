package task2;

//Mutable class for Circle
class Circle {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public double calculateCircumference() {
     return 2 * Constants.PI * radius;
 }

 public double calculateArea() {
     return Constants.PI * radius * radius;
 }
}

