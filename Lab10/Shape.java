package sample1;

abstract class Shape {
    public abstract double calculateArea();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Circle extends Shape {
    private double radius;
    private double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

