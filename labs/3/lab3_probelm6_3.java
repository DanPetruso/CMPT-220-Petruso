import java.util.*;

public class lab3_probelm6_3 {
	
	public static int reverse(int n) {
		int reverse = 0;
		for(; n > 0; n /= 10) {
			reverse *= 10;
			reverse += n % 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int n) {
		return reverse(n) == n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to be reversed: ");
		int n = input.nextInt();
		System.out.println(reverse(n));
		System.out.print(isPalindrome(n)? "The number is a palindrome." : "The number is not a palindrome.");

	}
}
