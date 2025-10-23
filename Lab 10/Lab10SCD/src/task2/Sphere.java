package task2;

//Mutable class for Sphere
class Sphere {
 private double radius;

 public Sphere(double radius) {
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public double calculateVolume() {
     return (4.0 / 3) * Constants.PI * Math.pow(radius, 3);
 }

 public double calculateSurfaceArea() {
     return 4 * Constants.PI * radius * radius;
 }
}

