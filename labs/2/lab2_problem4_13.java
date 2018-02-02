
import java.util.*;

public class lab2_problem4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter to see if it is a vowel: ");
		char x = input.next().charAt(0);
		
		String vowel = "AaEeIiOoUu";
		
		if(!Character.isAlphabetic(x))
			System.out.println("Invalid character.");
		else
			System.out.println(vowel.indexOf(x) >= 0? "It is a vowel." : "It is a consonant.");
		
	}

}
