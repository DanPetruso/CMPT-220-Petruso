
import java.util.*;

public class lab2_problem4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char x = input.next().charAt(0);
		
		int uni = (int) x;
		
		System.out.println("The unicode for character " + x + " is " + uni);
	}

}
