import java.util.*;

public class lab3_problem5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer. Input ends once 0 is input: ");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(0);
		int choice = 1;
		
		while(choice != 0) {
			choice = input.nextInt();
			numbers.add(choice);
		}
		
		int positives = 0;
		int negatives = 0;
		double total = 0;
		
		for(int x : numbers) {
			if(x > 0)	positives++;
			if(x < 0)	negatives++;
			total += x;
		}
		
		double average = total / (numbers.size() -1);
		
		System.out.println("The number of positives is: " + positives);
		System.out.println("The number of negatives is: " + negatives);
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + average);

	}
}