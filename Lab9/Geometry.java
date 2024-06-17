package sample1;

public class Geometry {

		    public double calculateArea(double length, double width) {
		        return length * width;
		    }

		   
		    public double calculateArea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    
		    public double calculateVolume(double length, double width, double height) {
		        return length * width * height;
		    }
}
