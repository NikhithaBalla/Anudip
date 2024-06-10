package javafullstack;

public class Palindrome {
                public static boolean isPalindrome(int num) {
		        int originalNum = num;
		        int rev= 0;
		        while (num != 0) {
		            int digit = num % 10;
		            rev = rev * 10 + digit;
		            num =num/10;
		        }
		        return originalNum == rev;
 }

		    public static void main(String[] args) {
		        int num = 121;
		        if (isPalindrome(num)) {
		            System.out.println(num + " is a palindrome.");
		        } else {
		            System.out.println(num + " is not a palindrome.");
		        }
		    }
}
			
			