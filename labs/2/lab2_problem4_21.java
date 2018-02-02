import java.util.*;

public class lab2_problem4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an SSN: ");
		String ssn = input.next();
		
		String pattern = "(\\d\\d\\d)-(\\d\\d)-(\\d\\d\\d\\d)";
		
		System.out.println(ssn.matches(pattern)? ssn + " is a valid SSN." : ssn + " is an invalid SSN.");

	}
}
