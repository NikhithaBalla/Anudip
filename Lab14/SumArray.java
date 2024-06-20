package sample1;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Scanner sc=new Scanner(System.in);	                       //creating scanner object
        System.out.println("Enter the size of the array : ");      //size of array taking from user
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");   //taking input elements from user
        int[] arr=new int[n];                                      //creating an array
        for(int i=0;i<n;i++)                                       //iterating over the loop
        {
           arr[i]=sc.nextInt();	
        }
                 //sum of the elements of the array
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum+=arr[i];
        }
        System.out.println("Sum of the array: "+sum);                //printing sum of array elements
	}
	} 