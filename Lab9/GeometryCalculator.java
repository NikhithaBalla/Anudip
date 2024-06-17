package sample1;
import java.util.Scanner;
public class GeometryCalculator{
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = geometry.calculateArea(length, width);
                    System.out.println("Area of the rectangle: " + rectangleArea);
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = geometry.calculateArea(radius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;
                case 3:
                    System.out.print("Enter the length of the box: ");
                    double boxLength = scanner.nextDouble();
                    System.out.print("Enter the width of the box: ");
                    double boxWidth = scanner.nextDouble();
                    System.out.print("Enter the height of the box: ");
                    double boxHeight = scanner.nextDouble();
                    double boxVolume = geometry.calculateVolume(boxLength, boxWidth, boxHeight);
                    System.out.println("Volume of the box: " + boxVolume);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
            System.out.println(); 
    }
    
    }
}

