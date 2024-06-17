package sample1;

public class Main1 {

	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(2,4);
	        Circle circle = new Circle(4);

	        double areaRectangle = rectangle.calculateArea();
	        System.out.println("Area of Rectangle: " + areaRectangle);

	        double areaCircle = circle.calculateArea();
	        System.out.println("Area of Circle: " + areaCircle);
	    }
	}