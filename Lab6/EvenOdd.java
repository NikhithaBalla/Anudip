
package sample1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n +" is an even no.");
		}
		else
		{
			System.out.println( n+" is an odd no.");
		}
		
	}

}
