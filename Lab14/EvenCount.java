package sample1;
import java.util.Scanner;
public class EvenCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //creating scanner object
		System.out.println("Enter the size of the array :  "); //size of array
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array : "); //elements of array
		int[] arr=new int[n];  //creating an array of size n
		for(int i=0;i<n;i++)  
		{
			arr[i]=sc.nextInt();
		}
		//finding the count of even and odd no. in array
		int oddcount=0;   //initialize to 0
		int evencount=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0) // if even
			{
				evencount+=1;
			}
			else            //if odd
			{
				oddcount+=1; 
			}
		}
		//printing the count of even and odd numbers
		System.out.println("Count of even numbers: "+evencount);  
		System.out.println("Count of odd  numbers: "+oddcount);
	}
}
		
		