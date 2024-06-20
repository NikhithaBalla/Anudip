package sample1;

//Create an array of n elements , sum only positive odd numbers
import java.util.Scanner;

public class OddPositive {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("enter only positive numbers");
            
        }
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input, please enter integers only.");
                scanner.close();
                return;
            }
        }


        // Calculate the sum of positive odd numbers
        int sum = sumPositiveOddNumbers(numbers);

        // Print the result
        System.out.println("Sum of positive odd numbers: " + sum);
    }

    // Method to sum positive odd numbers
    public static int sumPositiveOddNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}
