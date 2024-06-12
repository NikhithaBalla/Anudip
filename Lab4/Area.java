package javafullstack;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Do you want to find the area of a circle! Enter 'Yes' to continue or any other input to exit: ");
            userInput = sc.next();

            if (userInput.equalsIgnoreCase("Yes")) {
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();

                double area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
            }
        } while (userInput.equalsIgnoreCase("Yes"));
	}

}
