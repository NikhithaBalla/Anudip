package sample1;
class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving a " + brand + " " + model);
    }
}

class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("The " + color + " car is honking.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("BMW", "M340i", 2024, "Red");
        c.drive();
        c.honk();
    }
}
