package task2;

public class GeometricCalculations {
    public static void main(String[] args) {
        // Circle with initial radius
        Circle circle = new Circle(5);
        System.out.println("Circumference of Circle: " + circle.calculateCircumference());
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Sphere with initial radius
        Sphere sphere = new Sphere(5);
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
        System.out.println("Surface Area of Sphere: " + sphere.calculateSurfaceArea());

        // Modifying the radius of circle and sphere
        circle.setRadius(7);
        sphere.setRadius(7);
        System.out.println("\nAfter modifying radius to 7:");
        System.out.println("Circumference of Circle: " + circle.calculateCircumference());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
        System.out.println("Surface Area of Sphere: " + sphere.calculateSurfaceArea());
    }
}

