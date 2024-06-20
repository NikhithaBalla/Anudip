
package sample1;
import java.util.Scanner;

public class LargeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();
        int a[] = new int[size]; // Initialize array after getting size input

        System.out.println("Enter the values of each index:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter value of a[" + i + "]:");
            a[i] = sc.nextInt(); // Assign values inside array
        }

        // Initialize larger and smaller with the first element of the array
        int larger = a[0];
        int smaller = a[0];

        // Finding the largest and smallest numbers in the array
        for (int i = 1; i < a.length; i++) {
            if (a[i] > larger) {
                larger = a[i];
            }
            if (a[i] < smaller) {
                smaller = a[i];
            }
        }

        System.out.println("The largest number in the array is: " + larger);
        System.out.println("The smallest number in the array is: " + smaller);

      
    }
}
