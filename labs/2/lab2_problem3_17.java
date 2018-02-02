import java.util.*;

public class lab2_problem3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("(0) scissors, (1) rock, (2) paper.");
		int choice = input.nextInt();
		int com = (int) Math.random()*3;
		
		if(choice == 0) {
			System.out.print("You entered Scissors, ");
			if(com == 1)
				System.out.println(" and the computer entered Rock, you lose!");
			if(com == 2)
				System.out.println(" and the computer entered Paper, you win!");
			if(com == 0)
				System.out.println(" and the computer entered Scissors, draw!");				
		}
		else if(choice == 1) {
			System.out.print("You entered Rock, ");
			if(com == 2)
				System.out.println(" and the computer entered Paper, you lose!");
			if(com == 0)
				System.out.println(" and the computer entered Scissors, wou win!");
			if(com == 1)
				System.out.println(" and the computer entered Rock, draw!");
		}
		else if(choice == 2) {
			System.out.println("You entered Paper, ");
			if(com == 0)
				System.out.println(" and the computer entered Scissors, you lose!");
			if(com == 1)
				System.out.println(" and the computer entered Rock, you win!");
			if(com == 2)
				System.out.println(" and the computer entered Paper, draw!");
		}
		else
			System.out.println("Invalid number");

	}

}
